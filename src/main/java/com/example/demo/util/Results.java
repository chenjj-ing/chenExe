package com.example.demo.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Results {

    private static final ResponseEntity NO_CONTENT;

    static {
        NO_CONTENT = new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<T> success(T data) {
        return data == null ? NO_CONTENT : ResponseEntity.ok(data);
    }

    public static <T> ResponseEntity<T> success() {
        return NO_CONTENT;
    }

}
