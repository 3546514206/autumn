package edu.zjnu.autumn;

import edu.zjnu.autumn.factory.BeansException;
import edu.zjnu.autumn.factory.PropertyValue;
import edu.zjnu.autumn.factory.PropertyValues;
import edu.zjnu.autumn.factory.TestBean;
import edu.zjnu.autumn.factory.config.BeanDefinition;
import edu.zjnu.autumn.factory.support.DefaultListableBeanFactory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 测试程序
 * @author: 杨海波
 * @date: 2021-11-05
 **/
public class BeanFactoryTest {

    @Test
    public void test() throws BeansException {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinition bd = new BeanDefinition(TestBean.class);
        factory.registryBeanDefinition("testBean", bd);

        TestBean bean = (TestBean) factory.getBean("testBean", "杨海波");
        System.out.println(bean.hashCode());

        TestBean bean1 = (TestBean) factory.getBean("testBean");
        System.out.println(bean1.hashCode());

        System.out.println(bean1.getField());
    }

    @Test
    public void cglibTest() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TestBean.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });

        Object o = enhancer.create(new Class[]{String.class}, new Object[]{"小傅哥"});
        System.out.println(((TestBean) o).getField());
    }

    @Test
    public void testApplyProperty() throws BeansException {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // 注册userDao
        factory.registryBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        // 设置UserService属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userId", "10003"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new UserDao()));
        BeanDefinition userServiceBeanDefinition = new BeanDefinition(UserService.class);
        userServiceBeanDefinition.setPropertyValues(propertyValues);
        // 注册UserService
        factory.registryBeanDefinition("userService", userServiceBeanDefinition);

        UserService userService = (UserService) factory.getBean("userService");
        userService.queryUserInfo();
    }


}
