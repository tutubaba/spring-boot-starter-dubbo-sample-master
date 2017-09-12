package cn.teaey.springboot.test.model;

import java.io.Serializable;

/**
 * Created by tuyuelai on 2017/9/6.
 */
public class Student implements Serializable{
    Integer Id;
    String name;

    public Student(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
