package com.springapi.stereotypes.controller;

import com.springapi.stereotypes.model.Person;
import com.springapi.stereotypes.repository.ContactRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/contact")
public class ContactController {
    /*
     * The class is annotated with the @RestController annotation which is used to mark the class as a Spring MVC controller and also it will return the data directly as response.

     * The class is also annotated with @RequestMapping("/contact") to map all the endpoints to the path /contact.

     * The save method is annotated with @PostMapping("/save") to map it to the endpoint "/contact/save" and handle the POST request.

     * The @RequestBody annotation is used to bind the JSON payload to a Person object.

     * The method returns a ResponseEntity object containing the saved Person object and a status of 201.

     * The retrieve method is annotated with @GetMapping("/retrieve/{id}") to map it to the endpoint "/contact/retrieve/{id}" and handle the GET request.

     * The @PathVariable annotation is used to bind the id from the URL to a variable in the method.

     * The method returns a ResponseEntity object containing the retrieved Person object and a status of 200.
     * */
    @Autowired
    ContactRepository contactRepository;

    @PostMapping("/save")
    public ResponseEntity<Person> save(@RequestBody Person person){
        Person saved = contactRepository.save(person);
        return new ResponseEntity(saved, HttpStatus.CREATED);
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Person> retrieve(@PathVariable Integer id){
        Person person = contactRepository.findById(id).get();
        return new ResponseEntity(person, HttpStatus.OK);
    }
}