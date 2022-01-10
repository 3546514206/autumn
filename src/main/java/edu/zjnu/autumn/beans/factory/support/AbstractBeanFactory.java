package edu.zjnu.autumn.beans.factory.support;

import edu.zjnu.autumn.beans.factory.BeanFactory;
import edu.zjnu.autumn.beans.factory.BeansException;
import edu.zjnu.autumn.beans.factory.config.BeanDefinition;

/**
 * @description: 抽象bean工厂
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    //获取bean实例
    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        Object bean = getSingletonBean(beanName);
        if (null == bean) {
            BeanDefinition bd = getBeanDefinition(beanName);
            bean = createBean(beanName, bd, args);
        }

        return bean;
    }

    protected abstract Object createBean(String beanName, BeanDefinition bd, Object... args) throws BeansException;

    // 子类容器必须实现或者通过继承拥有此方法
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
