package com.example.serviceimpl;

import com.example.bean.Student;
import com.example.mapper.UserMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Student showInfo(String name) {
        return userMapper.getInfo(name);
    }
}
