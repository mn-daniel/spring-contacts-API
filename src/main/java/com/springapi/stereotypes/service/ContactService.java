package com.springapi.stereotypes.service;

import com.springapi.stereotypes.model.Person;
import com.springapi.stereotypes.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    ContactRepository contactRepository;

    public Person retrieve(Integer id){
        return contactRepository.findById(id).get();
    }

    public Person save(Person person){
        return contactRepository.save(person);
    }
}
