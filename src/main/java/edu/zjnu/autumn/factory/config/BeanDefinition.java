package edu.zjnu.autumn.factory.config;

/**
 * @description: Bean定义
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public class BeanDefinition {

    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return bean;
    }

    public void setBeanClass(Class bean) {
        this.bean = bean;
    }
}
