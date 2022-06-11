package com.yurybury.person.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.yurybury.person.model.Person;
import com.yurybury.person.model.PersonAdd;
import com.yurybury.person.model.PersonUpdate;

@RestController
public class PersonApiController implements PersonApi {
 
    private final HashMap<String, com.yurybury.person.domain.Person> persons = new HashMap<>();
    private Long index = 0L;
 
    @Override
    public ResponseEntity<Person> addPerson(PersonAdd apiPerson) {
        
        com.yurybury.person.domain.Person person = new com.yurybury.person.domain.Person();

        person.setId(String.valueOf(index));
        person.setHref(URI.create(String.valueOf(index)));
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

        persons.put(String.valueOf(index), person);
        index++;
 
        return ResponseEntity.ok(domainToApi(person));
    }
 

    @Override
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> pl = new ArrayList<Person>();
        for (String key : persons.keySet()) {
            pl.add(domainToApi(persons.get(key)));
        }
        return ResponseEntity.ok(pl);
    }


    @Override
    public ResponseEntity<Person> getPerson(String id) {
        if (persons.containsKey(id)) {
            return ResponseEntity.ok(domainToApi(persons.get(id)));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Void> deletePerson(String id) {
        if (persons.containsKey(id)) {
            persons.remove(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @Override
    public ResponseEntity<Person> updatePerson(String id, PersonUpdate apiPerson) {
        if (persons.containsKey(id)) {
            com.yurybury.person.domain.Person person = persons.get(id);
            person.setLastUpdate(OffsetDateTime.now());
            person.setFromDate(OffsetDateTime.now());
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
    
            persons.replace(id, person);
    
            return ResponseEntity.ok(domainToApi(person));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    private Person domainToApi(com.yurybury.person.domain.Person person) {
        Person p = new Person();

        p.setId(person.getId());
        p.setHref(person.getHref());
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