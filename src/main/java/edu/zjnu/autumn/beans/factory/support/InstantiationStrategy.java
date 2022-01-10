package edu.zjnu.autumn.beans.factory.support;

import edu.zjnu.autumn.beans.factory.BeansException;
import edu.zjnu.autumn.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description: InstantiationStrategy
 * @author: 杨海波
 * @date: 2022-01-06
 **/
public interface InstantiationStrategy {

    Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object... args) throws BeansException;
}
