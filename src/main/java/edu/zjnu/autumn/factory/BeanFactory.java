package edu.zjnu.autumn.factory;

import edu.zjnu.autumn.factory.config.BeanDefinition;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: Bean工厂
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
