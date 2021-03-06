package com.example.demo.service;

import com.example.demo.dao.bean.Student;

import java.util.List;

public interface IexampleServer {

    /**
     * description: 查询学生
     * <p>
     * date 2020/6/11 16:32
     *
     * @param student
     * @return java.util.List<com.example.demo.dao.bean.Student>
     * @author junjie.chen03@hand-china.com
     */
    List<Student> selectStudent(Student student);

    /**
     * description: 批量添加学生
     * <p>
     * date 2020/6/11 16:34
     *
     * @param students
     * @return java.lang.Integer
     * @author junjie.chen03@hand-china.com
     */
    int bathAddStudent(List<Student> students);

    /**
     * description: 修改学生信息
     * <p>
     * date 2020/6/11 16:35
     *
     * @param student
     * @return int
     * @author junjie.chen03@hand-china.com
     */
    int updateStudent(Student student);

    /**
     * description: 删除学生信息
     * <p>
     * date 2020/6/11 16:35
     *
     * @param id
     * @return int
     * @author junjie.chen03@hand-china.com
     */
    int deleteStudent(Long id);
}
