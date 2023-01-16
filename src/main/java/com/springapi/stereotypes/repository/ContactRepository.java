package com.springapi.stereotypes.repository;


import com.springapi.stereotypes.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Person,Integer> {
}
