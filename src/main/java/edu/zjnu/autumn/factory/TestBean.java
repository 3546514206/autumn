package edu.zjnu.autumn.factory;

/**
 * @description: todo
 * @author: 杨海波
 * @date: 2021-11-03
 **/
public class TestBean {

    private String field;

    public TestBean(String field) {
        this.field = field;
    }
//
//    public TestBean() {
//    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
