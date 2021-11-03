package edu.zjnu.autumn;

import org.junit.Test;

/**
 * @description: todo
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public class BeanFactoryTest {

    @Test
    public void test() {
        BeanDefinition testBeanDefinition = new BeanDefinition();
        testBeanDefinition.setBean(new TestBean("我是猪头三"));
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("testBeanDefinition", testBeanDefinition);
        TestBean testBean = (TestBean) beanFactory.getBean("testBeanDefinition");
        System.out.println(testBean.getField());
    }
}
