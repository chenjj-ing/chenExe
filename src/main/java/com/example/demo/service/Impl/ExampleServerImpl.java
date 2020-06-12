package com.example.demo.service.Impl;

import com.example.demo.dao.bean.Student;
import com.example.demo.dao.mapper.ExampleMaper;
import com.example.demo.service.IexampleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleServerImpl implements IexampleServer {

    @Autowired
    private ExampleMaper exampleMaper;

    @Override
    public List<Student> selectStudent(Student student) {
        return exampleMaper.selectStudent(student);
    }

    @Override
    public int bathAddStudent(List<Student> students) {
        return exampleMaper.bathAddStudent(students);
    }

    @Override
    public int updateStudent(Student student) {
        return exampleMaper.updateStudent(student);
    }

    @Override
    public int deleteStudent(Long id) {
        return exampleMaper.deleteStudent(id);
    }
}
