package com.sm.demo.mapper;

import org.mapstruct.MappingTarget;

public interface BaseMapper<E, D> {

    E toEntity(D dto);

    D toDto(E entity);

    void updateToEntity(D dto, @MappingTarget E entity);

}
