package com.example.demofinal1.rest;


import com.example.demofinal1.entity.PersonEntity;
import com.example.demofinal1.service.PersonService;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(
        value = {"/person"},
        produces = MediaType.APPLICATION_JSON_VALUE
)
@CrossOrigin(origins = "http://localhost:3000",maxAge = 3600)
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/get_people")
    public List<PersonEntity> getPeople(){
        return personService.getPeople();
    }

//    @GetMapping("/login")
//    public  String  login(@RequestBody ObjectKey objectKey){
//        return
//    }

    @PostMapping("/add_person")
    public List<PersonEntity> addPerson(@RequestBody PersonEntity person){
        return personService.addPerson(person);
    }

    @PutMapping("/edit_person")
    public List<PersonEntity> editPerson(@RequestBody PersonEntity person){
        return personService.editPerson(person);
    }

    @DeleteMapping("/delete_person")
    public List<PersonEntity> deletePerson(@RequestParam("id") String id){
        return personService.deletePerson(id);
    }


//    @Autowired
//    private PersonService personService;
//
//    @GetMapping
//    public List<PersonEntity> getPeople(){
//        return personService.getPeople();
//    }
//    @PostMapping
//    public PersonEntity addPerson(@RequestBody PersonEntity person){
//        return personService.addPerson(person);
//    }
//    @PutMapping
//    public PersonEntity editPerson(@RequestBody PersonEntity person){
//        return personService.editPerson(person);
//    }
//    @DeleteMapping("/{id}")
//    public void deletePerson(@PathVariable("id") String id){
//        personService.deletePerson(id);
//    }

}
