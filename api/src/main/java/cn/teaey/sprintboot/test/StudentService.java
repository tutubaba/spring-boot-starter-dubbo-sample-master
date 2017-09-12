package cn.teaey.sprintboot.test;

import cn.teaey.springboot.test.model.Student;

/**
 * Created by tuyuelai on 2017/9/6.
 */
public interface StudentService {
    Student findById(Integer id);
}
