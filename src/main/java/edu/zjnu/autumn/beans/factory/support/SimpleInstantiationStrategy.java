package edu.zjnu.autumn.beans.factory.support;

import edu.zjnu.autumn.beans.factory.BeansException;
import edu.zjnu.autumn.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: JDK  实例化
 * @author: 杨海波
 * @date: 2022-01-06
 **/
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object... args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();

        try {
            if (null != constructor) {
                return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]");
        }

    }
}
