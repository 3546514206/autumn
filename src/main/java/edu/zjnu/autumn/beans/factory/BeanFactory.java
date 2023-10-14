package edu.zjnu.autumn.beans.factory;

/**
 * @description: Bean工厂
 * @author: 杨海波
 *
 * @date: 2021-11-03
 **/
public interface BeanFactory {

    Object getBean(String beanName, Object... args) throws BeansException;
}
