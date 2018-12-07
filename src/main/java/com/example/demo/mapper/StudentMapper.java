package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

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

    @Select("SELECT * FROM student where id= #{id}")
    Student get(Long id);

    @Insert("INSERT INTO student(name,class_id,stu_num,phone,school,state) VALUES(#{name}, #{class_id}, #{stu_num}, #{phone}, #{school}, #{state} )")
    void insert(Student student);

}
