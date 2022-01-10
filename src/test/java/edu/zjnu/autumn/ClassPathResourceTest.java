package edu.zjnu.autumn;

import edu.zjnu.autumn.core.io.ClassPathResource;
import org.junit.Test;

/**
 * @description: ClassPathResourceTest
 * @author: 杨海波
 * @date: 2022-01-10
 **/
public class ClassPathResourceTest {

    @Test
    public void test(){
        ClassPathResource resource = new ClassPathResource(null);
        System.out.println(resource);

    }

}
