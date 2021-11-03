package edu.zjnu.autumn.factory.support;

import edu.zjnu.autumn.factory.BeansException;
import edu.zjnu.autumn.factory.config.BeanDefinition;

/**
 * @description: todo
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition bd) throws BeansException {
        Object bean = null;

        try {
            bean = bd.getBean().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //实例化完成,调用父类方法加入单例容器中
        addSingletonBean(beanName, bean);

        return bean;
    }
}
