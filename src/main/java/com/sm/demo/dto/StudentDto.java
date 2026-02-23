package com.sm.demo.dto;

import com.sm.demo.enums.Gender;
import lombok.Data;

@Data
public class StudentDto {
    private String name;
    private int age;
    private Gender gender;
    private String address;
}
