package com.example.demo.dao.bean;

import com.example.demo.util.BaseBean;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseBean {

    private Long id;

    private String name;

    private Date birth;

}
