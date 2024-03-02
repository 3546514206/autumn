package edu.zjnu.autumn.core.io;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @description: Resource
 * @author: 杨海波
 * @date: 2022-01-11
 **/
public class DefaultResourceLoader implements ResourceLoader {

    @Override
    public Resource getResource(String location) {
        assert null != location;

        if (location.startsWith(CLASSPATH_URL_PREFIX)) {

            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        } else {

            try {

                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {

                return new FileSystemResource(location);
            }
        }

    }
}
