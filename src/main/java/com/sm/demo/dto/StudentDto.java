package com.sm.demo.dto;

import com.sm.demo.enums.Gender;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class StudentDto {

    @NotBlank(message = "message must not be blank")
    private String name;

    @Min(value = 0, message = "age must > 0")
    private int age;
    private Gender gender;
    private String address;
}
