package com.yurybury.person.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.yurybury.person.model.Person;
import com.yurybury.person.model.PersonAdd;
import com.yurybury.person.model.PersonUpdate;
import com.yurybury.person.domain.PersonsRepository;

@Component
@RestController
public class PersonApiController implements PersonApi {
    private Long index = 0L;

    @Autowired
    private final PersonsRepository personsRepository;

	public PersonApiController(PersonsRepository personsRepository) {
		this.personsRepository = personsRepository;
	}
    

    @Override
    public ResponseEntity<Person> addPerson(PersonAdd apiPerson) {
        
        com.yurybury.person.domain.Person person = new com.yurybury.person.domain.Person();

        person.setId(String.valueOf(index));
        person.setStatus("Active");
        person.setCreationDate(OffsetDateTime.now());
        person.setLastUpdate(OffsetDateTime.now());
        person.setFromDate(OffsetDateTime.now());
        person.setToDate(null);

        person.setNamePrefix(apiPerson.getNamePrefix());
        person.setGivenName(apiPerson.getGivenName());
        person.setMiddleName(apiPerson.getMiddleName());
        person.setFamilyName(apiPerson.getFamilyName());
        person.setNickname(apiPerson.getNickname());
        person.setGender(apiPerson.getGender());
        person.seteMailAddress(apiPerson.geteMailAddress());
        person.setWorkPhone(apiPerson.getWorkPhone());
        person.setPrivatePhone(apiPerson.getPrivatePhone());
        person.setWebHomePage(apiPerson.getWebHomePage());

        index++;

        return ResponseEntity.ok(domainToApi(personsRepository.save(person)));
    }
 

    @Override
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> pl = new ArrayList<Person>();

        for (com.yurybury.person.domain.Person p : personsRepository.findAll()) {
            pl.add(domainToApi(p));
        }
        return ResponseEntity.ok(pl);
    }


    @Override
    public ResponseEntity<Person> getPerson(String id) {
        java.util.Optional<com.yurybury.person.domain.Person> p = personsRepository.findById(id);
        if (p.isPresent()) {
            return ResponseEntity.ok(domainToApi(p.get()));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Void> deletePerson(String id) {
        if (personsRepository.existsById(id)) {
            personsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @Override
    public ResponseEntity<Person> updatePerson(String id, PersonUpdate apiPerson) {
        if (personsRepository.existsById(id)) {
            java.util.Optional<com.yurybury.person.domain.Person> person = personsRepository.findById(id);
            person.get().setLastUpdate(OffsetDateTime.now());
            person.get().setFromDate(OffsetDateTime.now());
            person.get().setNamePrefix(apiPerson.getNamePrefix());
            person.get().setGivenName(apiPerson.getGivenName());
            person.get().setMiddleName(apiPerson.getMiddleName());
            person.get().setFamilyName(apiPerson.getFamilyName());
            person.get().setNickname(apiPerson.getNickname());
            person.get().setGender(apiPerson.getGender());
            person.get().seteMailAddress(apiPerson.geteMailAddress());
            person.get().setWorkPhone(apiPerson.getWorkPhone());
            person.get().setPrivatePhone(apiPerson.getPrivatePhone());
            person.get().setWebHomePage(apiPerson.getWebHomePage());
    
            personsRepository.save(person.get());
    
            return ResponseEntity.ok(domainToApi(person.get()));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    private Person domainToApi(com.yurybury.person.domain.Person person) {
        Person p = new Person();

        p.setId(person.getId());
        p.setHref(URI.create(person.getHref()));
        p.setStatus(person.getStatus());
        p.setCreationDate(person.getCreationDate());
        p.setLastUpdate(person.getLastUpdate());
        p.setFromDate(person.getFromDate());
        p.setToDate(person.getToDate());
        p.setNamePrefix(person.getNamePrefix());
        p.setGivenName(person.getGivenName());
        p.setMiddleName(person.getMiddleName());
        p.setFamilyName(person.getFamilyName());
        p.setNickname(person.getNickname());
        p.setGender(person.getGender());
        p.seteMailAddress(person.geteMailAddress());
        p.setWorkPhone(person.getWorkPhone());
        p.setPrivatePhone(person.getPrivatePhone());
        p.setWebHomePage(person.getWebHomePage());

        return p;
    }
}

