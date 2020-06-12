package com.example.demo.dao.bean;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    /*
    * 名字
    * */
    private String name;

    /*
    * 种类
    * */
    private String kind;
}
