package com.sm.demo.mapper;

import com.sm.demo.dto.StudentDto;
import com.sm.demo.entity.Student;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface StudentMapper extends BaseMapper<Student, StudentDto> {
//    Student toEntity(StudentDto studentDto);
//    StudentDto toDto(Student student);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateToEntity(StudentDto studentDto, @MappingTarget Student student);
}
