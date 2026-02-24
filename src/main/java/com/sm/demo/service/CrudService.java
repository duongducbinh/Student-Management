package com.sm.demo.service;

import com.sm.demo.exception.ResourceNotFoundException;
import com.sm.demo.mapper.BaseMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class CrudService<E, D, ID>{
    protected abstract JpaRepository<E, ID> getRepository();
    protected abstract BaseMapper<E, D> getMapper();

    public List<D> findAll(){
        return getRepository().findAll()
                .stream()
                .map(getMapper()::toDto)
                .toList();
    }

    public D findById(ID id){
        E entity = getRepository().findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No record found for given id" + id));
        return getMapper().toDto(entity);
    }

    public D save(D dto){
        E entity = getRepository().save(getMapper().toEntity(dto));
        return getMapper().toDto(entity);
    }

    public void update(D dto, ID id){
        E e = getRepository().findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No record found with id: " + id));
        getMapper().updateToEntity(dto, e);
    }

    public void delete( ID id){
        getRepository().deleteById(id);
    }
}
