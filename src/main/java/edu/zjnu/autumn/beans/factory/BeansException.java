package edu.zjnu.autumn.beans.factory;

/**
 * @description: BeansException
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public class BeansException extends Exception {

    public String message;

    public BeansException(String s) {
        message = s;
    }
}
