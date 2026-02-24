package com.sm.demo.service;

import com.sm.demo.dto.TeacherDto;
import com.sm.demo.entity.Teacher;
import com.sm.demo.mapper.BaseMapper;
import com.sm.demo.mapper.TeacherMapper;
import com.sm.demo.repository.TeacherRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherService extends CrudService<Teacher, TeacherDto, Long> {

    private final TeacherRepo teacherRepo;
    private final TeacherMapper teacherMapper;

    @Override
    protected JpaRepository<Teacher, Long> getRepository() {
        return teacherRepo;
    }

    @Override
    protected BaseMapper<Teacher, TeacherDto> getMapper() {
        return teacherMapper;
    }
}
