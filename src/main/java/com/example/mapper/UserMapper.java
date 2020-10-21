package com.example.mapper;


import com.example.bean.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Student getInfo(String name);
}
