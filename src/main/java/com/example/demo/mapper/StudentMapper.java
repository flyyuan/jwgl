package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * Demo class
 *
 * @author Benny Shi
 * @date 2018/12/7
 */
public interface StudentMapper {
    @Select("SELECT * FROM student")
    List<Student> getAll();
}
