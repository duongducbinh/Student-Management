package com.sm.demo.service;

import com.sm.demo.dto.StudentDto;
import com.sm.demo.Entity.Student;
import com.sm.demo.exception.ResourceNotFoundException;
import com.sm.demo.mapper.StudentMapper;
import com.sm.demo.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    public List<StudentDto> getAllStudents() {
        return studentRepo.findAll()
                .stream()
                .map(studentMapper::toDto)
                .collect(Collectors.toList());
    }

    public StudentDto getStudentById(Long id) {
        Student student = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        return studentMapper.toDto(student);
    }

    public StudentDto addStudent ( StudentDto studentDto ) {
        Student student = studentRepo.save(studentMapper.toEntity(studentDto));
        return studentMapper.toDto(student);
    }

    public void updateStudent ( StudentDto studentDto, Long id ) {
            Student s = studentRepo.getStudentById(id);
            studentMapper.updatetoEntity(studentDto, s);
    }
}
