package com.sm.demo.controller;

import com.sm.demo.dto.StudentDto;
import com.sm.demo.dto.TeacherDto;
import com.sm.demo.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> addStudent (@RequestBody @Valid StudentDto studentDTO) {
        StudentDto result = studentService.save(studentDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent (@RequestBody @Valid StudentDto studentDTO, @PathVariable Long id) {
        studentService.update(studentDTO, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
