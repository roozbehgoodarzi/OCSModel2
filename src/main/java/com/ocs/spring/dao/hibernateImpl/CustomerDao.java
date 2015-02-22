package com.ocs.spring.dao.hibernateImpl;

import com.ocs.entity.Customer;
import com.ocs.spring.dao.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * Created by Goodarzi on 10/12/14.
 */
@Repository
public class CustomerDao extends GenericDaoHibernate<Customer> {
//    @Autowired
//    private SessionFactory sessionFactory;

//    /**
//     * Get Hibernate Session Factory
//     *
//     * @return SessionFactory - Hibernate Session Factory
//     */
//    public SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//    /**
//     * Set Hibernate Session Factory
//     *
//     * @param sessionFactory SessionFactory - Hibernate Session Factory
//     */
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    /**
//     * Add customer
//     *
//     * @param   customer   customer
//     */
//
//    public void addCustomer(Customer customer) {
//        getSessionFactory().getCurrentSession().save(customer);
//    }
//
//    /**
//     * Delete customer
//     *
//     * @param   customer  customer
//     */
//
//    public void deleteCustomer(Customer customer) {
//        getSessionFactory().getCurrentSession().delete(customer);
//    }
//
//    /**
//     * Update customer
//     *
//     * @param  customer customer
//     */
//
//    public void updateCustomer(Customer customer) {
//        getSessionFactory().getCurrentSession().update(customer);
//    }
//
//    /**
//     * Get customer
//     *
//     * @param  id int
//     * @return customer
//     */
//
//    public Customer getCustomerById(int id) {
//        List list = getSessionFactory().getCurrentSession()
//                .createQuery("from Customer  where id=?")
//                .setParameter(0, id).list();
//        return (Customer)list.get(0);
//    }
//
//    /**
//     * Get customer List
//     *
//     * @return List - customer list
//     */
//
//    public List<Customer> getCustomers() {
//        List list = getSessionFactory().getCurrentSession().createQuery("from  Customer").list();
//        return list;
//    }

}
