package com.example.demo.service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Demo class
 *
 * @author Benny Shi
 * @date 2018/12/7
 */
@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;

    public List<Student> getall() {
        return studentMapper.getAll();
    }
}
