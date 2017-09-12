package cn.teaey.sprintboot.test;

import cn.teaey.springboot.test.model.Student;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by tuyuelai on 2017/9/6.
 */
@Service(version = "1.0.0")
public class StudentServiceImpl implements StudentService {
    @Override
    public Student findById(Integer id) {
        return new Student(1,"lwx");
    }
}
