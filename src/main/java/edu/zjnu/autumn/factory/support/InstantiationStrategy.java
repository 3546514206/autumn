package edu.zjnu.autumn.factory.support;

import edu.zjnu.autumn.factory.BeansException;
import edu.zjnu.autumn.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: 杨海波
 * @date: 2022-01-06
 **/
public interface InstantiationStrategy {

    Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object... args) throws BeansException;
}
