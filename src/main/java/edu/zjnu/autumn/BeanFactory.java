package edu.zjnu.autumn;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: Bean工厂
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public class BeanFactory {

    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name ,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
