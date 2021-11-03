package edu.zjnu.autumn.factory.config;

/**
 * @description: SingletonBeanRegistry
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public interface SingletonBeanRegistry {

   Object getSingletonBean(String beanName);
}
