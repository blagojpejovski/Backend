package com.example.demofinal1.repository;

import com.example.demofinal1.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demofinal1.entity.BlogEntity;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<BlogEntity,String> {
    public List<BlogEntity> findAllByOrderByIdDesc();


}