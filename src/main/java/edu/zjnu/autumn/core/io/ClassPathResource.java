package edu.zjnu.autumn.core.io;

import edu.zjnu.autumn.utils.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 从类路径加载
 * @author: 杨海波
 * @date: 2022-01-10
 **/
public class ClassPathResource implements Resource {

    private String classPath;

    private ClassLoader classLoader;

    @Override
    public InputStream getInputSteam() throws IOException {
        InputStream inputStream = classLoader.getResourceAsStream(classPath);

        if (null == inputStream) {
            throw new FileNotFoundException(classPath + " not found!");
        }

        return inputStream;
    }

    public ClassPathResource(String classPath) {
        this(classPath, null);
    }

    public ClassPathResource(String classPath, ClassLoader classLoader) {
        assert classPath != null;
        this.classPath = classPath;
        this.classLoader = (null == classLoader) ? ClassUtils.getDefaultClassLoader() : classLoader;
    }

}
