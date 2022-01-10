package edu.zjnu.autumn.beans.factory.support;

import edu.zjnu.autumn.beans.factory.config.SingletonBeanRegistry;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: DefaultSingletonBeanRegistry
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private ConcurrentHashMap<String, Object> singletonBeanMap = new ConcurrentHashMap<String, Object>();

    public Object getSingletonBean(String beanName) {
        return singletonBeanMap.get(beanName);
    }

    public void addSingletonBean(String beanName, Object singleObject) {
        singletonBeanMap.put(beanName, singleObject);
    }
}
