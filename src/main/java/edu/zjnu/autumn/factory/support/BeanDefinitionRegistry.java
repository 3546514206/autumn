package edu.zjnu.autumn.factory.support;

import edu.zjnu.autumn.factory.config.BeanDefinition;

/**
 * @description: todo
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public interface BeanDefinitionRegistry {

     void registryBeanDefinition(String beanName, BeanDefinition bd);
}
