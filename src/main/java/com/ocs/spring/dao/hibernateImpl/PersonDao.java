package com.ocs.spring.dao.hibernateImpl;

import com.ocs.entity.Person;
import com.ocs.exception.DaoException;
import com.ocs.exception.DataAccessException;
import com.ocs.exception.ExceptionReason;
import com.ocs.spring.dao.GenericDaoHibernate;
import com.ocs.util.DbUtil;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Goodarzi on 02/26/2015.
 */
@Repository("PersonDao")
public class PersonDao extends GenericDaoHibernate<Person> {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public Person getPersonByPersonId(String personId){
        String hql = "FROM Person as P WHERE P.personId = :personId";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("personId", personId);
        List<Person> persons = query.list();
        try {
            if(!DbUtil.checkResultExist(persons))
                throw new DaoException("Calling class " + PersonDao.class + " has an error on getPersonByEmployeeId: " + ExceptionReason.NoResult, (short)0);
            if(DbUtil.checkUniqueResult(persons)==false)
                throw new DaoException("Calling Class " + PersonDao.class + " has an error on getPersonByEmployeeId:" + ExceptionReason.NotUniqueResult, (short) 0);
        } catch (DaoException e) {
            throw new DataAccessException(e, (short) 0);
        }
        return persons.get(0);
    }

    public Person getPersonByAccountID(String accountId){
        String hql = "FROM Person as P WHERE P.accountId = :accountId";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("accountId", accountId);
        List<Person> persons = query.list();
        try {
            if(!DbUtil.checkResultExist(persons))
                throw new DaoException("Calling class " + PersonDao.class +" has an error on getPersonByAccountID: " + ExceptionReason.NoResult, (short)0);
            if(!DbUtil.checkUniqueResult(persons))
                throw new DaoException("Calling Class " + PersonDao.class + " has an error on getPersonByAccountID:" + ExceptionReason.NotUniqueResult, (short) 0);
        } catch (DaoException e) {
            throw new DataAccessException(e, (short) 0);
        }
        return persons.get(0);
    }
    public Person getPersonByNationalID(String nationalId){
        String hql = "FROM Person as P WHERE P.nationalId = :nationalId";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("nationalId", nationalId);
        List<Person> persons = query.list();
        try {
            if(!DbUtil.checkResultExist(persons))
                throw new DaoException("Calling class " + PersonDao.class +" has an error on getPersonByNationalID: " + ExceptionReason.NoResult, (short)0);
            if(!DbUtil.checkUniqueResult(persons))
                throw new DaoException("Calling Class " + PersonDao.class + " has an error on getPersonByNationalID:" + ExceptionReason.NotUniqueResult, (short) 0);
        } catch (DaoException e) {
            throw new DataAccessException(e, (short) 0);
        }

        return persons.get(0);
    }
}
