package com.ocs.spring.dao.hibernateImpl;

import com.ocs.entity.Person;
import com.ocs.spring.dao.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * Created by Goodarzi on 02/26/2015.
 */
@Repository("PersonDao")
public class PersonDao extends GenericDaoHibernate<Person> {
}
