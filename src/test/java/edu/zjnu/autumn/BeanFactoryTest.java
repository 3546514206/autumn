package edu.zjnu.autumn;

import edu.zjnu.autumn.factory.BeansException;
import edu.zjnu.autumn.factory.TestBean;
import edu.zjnu.autumn.factory.config.BeanDefinition;
import edu.zjnu.autumn.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

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
        factory.registryBeanDefinition("testBean",bd);

        TestBean bean =(TestBean) factory.getBean("testBean");
        System.out.println(bean.hashCode());

        TestBean bean1 = (TestBean) factory.getBean("testBean");
        System.out.println(bean1.hashCode());

        System.out.println(bean1.getField());
    }
}
