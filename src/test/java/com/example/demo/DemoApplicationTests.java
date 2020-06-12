package com.example.demo;

import com.example.demo.dao.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        // 可在配置文件调整日志级别和日志文件位置,默认打印在控制台
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        System.out.println(person);
    }

}
