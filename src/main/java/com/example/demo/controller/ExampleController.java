package com.example.demo.controller;

import com.example.demo.dao.bean.Student;
import com.example.demo.service.IexampleServer;
import com.example.demo.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @Autowired
    private IexampleServer iexampleServer;

    /**
     * description: 查
     * <p>
     * date 2020/6/11 16:52
     *
     * @param student
     * @return java.lang.String
     * @author junjie.chen03@hand-china.com
     */
    @GetMapping
    public ResponseEntity<List<Student>> selectStudent(@RequestBody Student student) {
        return Results.success(iexampleServer.selectStudent(student));
    }

    /**
     * description: 增
     * <p>
     * date 2020/6/11 17:14
     *
     * @param students
     * @return org.springframework.http.ResponseEntity<com.example.demo.dao.bean.Student>
     * @author junjie.chen03@hand-china.com
     */
    @PostMapping
    public ResponseEntity<List<Student>> bathAddStudent(@RequestBody List<Student> students) {
        iexampleServer.bathAddStudent(students);
        return Results.success(students);
    }

    /**
     * description: 改
     * <p>
     * date 2020/6/11 17:14
     *
     * @param student
     * @return org.springframework.http.ResponseEntity<com.example.demo.dao.bean.Student>
     * @author junjie.chen03@hand-china.com
     */
    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        iexampleServer.updateStudent(student);
        return Results.success(student);
    }

    /**
     * description: 删
     * <p>
     * date 2020/6/11 17:15
     *
     * @param id
     * @return org.springframework.http.ResponseEntity<?>
     * @author junjie.chen03@hand-china.com
     */
    @DeleteMapping
    public ResponseEntity<?> deleteStudent(@RequestParam Long id) {
        return Results.success(iexampleServer.deleteStudent(id));
    }

}
