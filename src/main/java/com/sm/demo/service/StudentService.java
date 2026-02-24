package com.sm.demo.service;

import com.sm.demo.dto.StudentDto;
import com.sm.demo.entity.Student;
import com.sm.demo.exception.ResourceNotFoundException;
import com.sm.demo.mapper.BaseMapper;
import com.sm.demo.mapper.StudentMapper;
import com.sm.demo.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService extends CrudService<Student, StudentDto, Long>{

    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    @Override
    protected JpaRepository<Student, Long> getRepository() {
        return studentRepo;
    }

    @Override
    protected BaseMapper<Student, StudentDto> getMapper() {
        return studentMapper;
    }
//
//    public List<StudentDto> getAllStudents() {
//        return studentRepo.findAll()
//                .stream()
//                .map(studentMapper::toDto)
//                .collect(Collectors.toList());
//    }
//
//    public StudentDto getStudentById(Long id) {
//        Student student = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found"));
//        return studentMapper.toDto(student);
//    }
//
//    public StudentDto addStudent ( StudentDto studentDto ) {
//        Student student = studentRepo.save(studentMapper.toEntity(studentDto));
//        return studentMapper.toDto(student);
//    }
//
//    @Transactional
//    public void updateStudent ( StudentDto studentDto, Long id ) {
//            Student s = studentRepo.findById(id)
//                            .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
//            studentMapper.updateToEntity(studentDto, s);
//    }
//
//    public void deleteStudent ( Long id ) {
//        Student s = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found"));
//        studentRepo.delete(s);
//
//    }


}
