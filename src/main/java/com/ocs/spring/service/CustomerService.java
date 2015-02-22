package com.ocs.spring.service;

import com.ocs.entity.Customer;
import com.ocs.spring.dao.hibernateImpl.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Goodarzi on 10/12/14.
 */
@Service("CustomerService")
@Transactional(readOnly = true)
public class CustomerService {

    // CustomerDAO is injected...
    @Autowired
    private CustomerDao customerDao;
    /**
     * Add Customer
     *
     * @param  customer Customer
     */
    @Transactional(readOnly = false)
    public void addCustomer(Customer customer) {
//        getCustomerDao().addCustomer(customer);
        getCustomerDao().save(customer);
    }

    /**
     * Delete Customer
     *
     * @param   customer  Customer
     */
    @Transactional(readOnly = false)
    public void deleteCustomer(Customer customer) {
//        getCustomerDao().deleteCustomer(customer);
        getCustomerDao().delete(customer);
    }

    /**
     * Update Customer
     *
     * @param customer  Customer
     */
    @Transactional(readOnly = false)
    public void updateCustomer(Customer customer) {
//        getCustomerDao().updateCustomer(customer);
        getCustomerDao().saveOrUpdate(customer);
    }

    /**
     * Get Customer
     *
     * @param  id int Customer Id
     */

    public Customer getCustomerById(int id) {
//        return getCustomerDao().getCustomerById(id);
        return getCustomerDao().get(Customer.class, Long.valueOf(id));
    }

    /**
     * Get Customer List
     *
     */

    public List<Customer> getCustomers() {
//        return getCustomerDao().getCustomers();
        return getCustomerDao().getAll(Customer.class);
    }

    /**
     * Get Customer DAO
     *
     * @return customerDao - Customer DAO
     */
    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    /**
     * Set Customer DAO
     *
     * @param  customerDao - CustomerDAO
     */
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
