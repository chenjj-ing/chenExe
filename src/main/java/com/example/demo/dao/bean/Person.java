package com.example.demo.dao.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    /*
     * 姓名
     * */
    private String name;

    /*
     * 年龄
     * */
    private Integer age;

    /*
     * 是否老板
     * */
    private Boolean boss;

    /*
     * 生日
     * */
    private Date birth;

    private Map<String, String> map;

    private List<String> list;

    /*
     * 宠物
     * */
    private Pet pet;
}
