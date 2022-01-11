package edu.zjnu.autumn.core.io;

/**
 * @description: ResourceLoader
 * @author: 杨海波
 * @date: 2022-01-11
 **/
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
