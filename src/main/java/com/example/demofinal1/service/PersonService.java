package com.example.demofinal1.service;

import com.example.demofinal1.entity.PersonEntity;
import com.example.demofinal1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService  {

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    private PersonRepository personRepository;



    public List<PersonEntity> getPeople(){
        List<PersonEntity> personEntityList = personRepository.findAll();
        return personEntityList;
    }


    public List<PersonEntity> addPerson(PersonEntity person){
        PersonEntity personDb = personRepository.save(person);
        return personRepository.findAll();
    }

    public List<PersonEntity> editPerson(PersonEntity person){
        PersonEntity personEntity = personRepository.findById(person.getId()).get();
        personEntity.setEmail(person.getEmail());
        personEntity.setName(person.getName());
        personEntity.setUsername(person.getUsername());
        personEntity.setPassword(person.getPassword());
        personEntity.setLastname(person.getLastname());
        PersonEntity savedEntity = personRepository.save(personEntity);
        return personRepository.findAll();
    }

    public List<PersonEntity> deletePerson(String id){
        PersonEntity person = personRepository.findById(id).get();
        personRepository.delete(person);
        return personRepository.findAll();
    }
}
