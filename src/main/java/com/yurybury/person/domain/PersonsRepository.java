package com.yurybury.person.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends CrudRepository<Person, String> {

}

