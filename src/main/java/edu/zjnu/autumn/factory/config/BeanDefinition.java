package edu.zjnu.autumn.factory.config;

import edu.zjnu.autumn.factory.PropertyValues;

/**
 * @description: Bean定义
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public class BeanDefinition {

    private Class bean;

    //属性
    private PropertyValues propertyValues;

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public BeanDefinition(Class bean) {
        this.bean = bean;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class bean, PropertyValues propertyValues) {
        this.bean = bean;
        this.propertyValues = propertyValues == null ? new PropertyValues() : propertyValues;
    }

    public Class getBeanClass() {
        return bean;
    }

    public void setBeanClass(Class bean) {
        this.bean = bean;
    }
}
