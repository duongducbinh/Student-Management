package com.sm.demo.controller;

import com.sm.demo.dto.StudentDto;
import com.sm.demo.service.StudentService;
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
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> addStudent (@RequestBody StudentDto studentDTO) {
        StudentDto result = studentService.addStudent(studentDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent (@RequestBody StudentDto studentDTO, @PathVariable Long id) {
        studentService.updateStudent(studentDTO, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
