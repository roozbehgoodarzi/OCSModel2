package com.ocs.spring.service;

import com.ocs.entity.Person;
import com.ocs.spring.dao.hibernateImpl.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Goodarzi on 02/26/2015.
 */
@Service("PersonService")
@Transactional(readOnly = true)
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Transactional
    public Person getPerson(Long id){
        return getPersonDao().get(Person.class, Long.valueOf(id));
    }

    @Transactional
    public void addPerson(Person person){
        getPersonDao().save(person);
    }
}
