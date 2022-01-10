package edu.zjnu.autumn.beans.factory.support;

import edu.zjnu.autumn.beans.factory.BeansException;
import edu.zjnu.autumn.beans.factory.config.BeanDefinition;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: DefaultListableBeanFactory
 * @author: 杨海波
 * @date: 2021-11-05
 **/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionConcurrentHashMap = new ConcurrentHashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition bd = beanDefinitionConcurrentHashMap.get(beanName);

        if (null == bd) throw new BeansException("bean " + beanName + " 的beanDefinition未定义");

        return bd;
    }

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition bd) {
        beanDefinitionConcurrentHashMap.put(beanName, bd);
    }
}
