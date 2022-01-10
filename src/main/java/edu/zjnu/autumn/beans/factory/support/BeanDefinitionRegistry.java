package edu.zjnu.autumn.beans.factory.support;

import edu.zjnu.autumn.beans.factory.config.BeanDefinition;

/**
 * @description: BeanDefinitionRegistry
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public interface BeanDefinitionRegistry {

     void registryBeanDefinition(String beanName, BeanDefinition bd);
}
