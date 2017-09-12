package cn.teaey.sprintboot.test;

import cn.teaey.springboot.test.model.Student;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author
 * @since 0.0.0
 */
@Component
public class AbcService {
    @Reference(version = "1.0.0")
    public EchoService echoService;


    @Reference(version = "1.0.0")
    public StudentService studentService;
}
