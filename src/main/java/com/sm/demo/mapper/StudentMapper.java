package com.sm.demo.mapper;

import com.sm.demo.dto.StudentDto;
import com.sm.demo.Entity.Student;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student toEntity(StudentDto studentDto);
    StudentDto toDto(Student student);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatetoEntity(StudentDto studentDto, @MappingTarget Student student);
}
