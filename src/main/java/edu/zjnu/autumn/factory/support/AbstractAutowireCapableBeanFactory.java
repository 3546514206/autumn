package edu.zjnu.autumn.factory.support;

import edu.zjnu.autumn.factory.BeansException;
import edu.zjnu.autumn.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description: todo
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition bd, Object... args) throws BeansException {
        Object bean;

        bean = createBeanInstantiaton(bd, beanName, args);

        //实例化完成,调用父类方法加入单例容器中
        addSingletonBean(beanName, bean);

        return bean;
    }

    private Object createBeanInstantiaton(BeanDefinition bd, String beanName, Object[] args) throws BeansException {
        Constructor constructorToUse = null;
        Class<?> beanClass = bd.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();

        //查找所需的构造方法
        for (Constructor<?> constructor : declaredConstructors) {
            if (null != args && constructor.getParameterTypes().length == args.length) {
                constructorToUse = constructor;
                // 找到第一个匹配的构造方法就直接返回了
                break;
            }
        }

        return getInstantiationStrategy().instantiation(bd, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
