package com.sm.demo.entity;

import com.sm.demo.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String address;

}
