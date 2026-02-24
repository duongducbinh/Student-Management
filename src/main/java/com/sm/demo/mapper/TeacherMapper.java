package com.sm.demo.mapper;

import com.sm.demo.dto.TeacherDto;
import com.sm.demo.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper extends BaseMapper<Teacher, TeacherDto> {
}
