package com.sm.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class TeacherDto {
    @NotBlank(message = "name must not be blank")
    private String name;
    @Min(value = 0, message = "age must > 0")
    private int age;
    private String gender;
    @Email(message = "invalid email format")
    private String email;
    @Pattern(
            regexp = "^(0|\\+84)[0-9]{9}$",
            message = "Invalid phone number"
    )
    private String phone;
    private String address;
    private Double salary;
}
