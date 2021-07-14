package com.example.demofinal1.repository;


import com.example.demofinal1.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,String> {

    PersonEntity findByNameAndEmail(String name,String email);

}
