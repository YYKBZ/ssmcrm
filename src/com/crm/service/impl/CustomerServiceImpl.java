package com.crm.service.impl;

import com.crm.dao.CustomerDao;
import com.crm.pojo.Customer;
import com.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    public boolean insertCustomer(Customer customer) {

        return customerDao.insertCustomer(customer) > 0 ? true : false;
    }

    public List<Customer> queryAll() {
        return customerDao.queryAll();
    }

    public Customer queryById(int cid) {
        return customerDao.queryById(cid);
    }

    public List<Customer> queryTerm(Customer customer) {
        return null;
    }

    public boolean deleteId(int cid) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {

        return customerDao.updateCustomer(customer) > 0 ? true : false;
    }

    @Override
    public boolean delCustomer(int id) {
        return customerDao.delCustomer(id) > 0 ? true : false;
    }

    @Override
    public List<Customer> searchCustomer(Customer customer) {
        return customerDao.searchCustomer(customer);
    }
}
