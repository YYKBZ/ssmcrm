package com.crm.service;

import com.crm.pojo.Customer;

import java.util.List;

public interface CustomerService {
    /*添加客户*/
    boolean insertCustomer(Customer customer);

    /*查询所有*/
    List<Customer> queryAll();

    /*根据id查询*/
    Customer queryById(int cid);

    /*根据条件查询*/
    List<Customer> queryTerm(Customer customer);

    /*根据id删除*/
    boolean deleteId(int cid);

    /*修改用户*/
    boolean updateCustomer(Customer customer);

    /*根据id删除用户*/
    boolean delCustomer(int id);

    /*高级搜索*/
    List<Customer> searchCustomer(Customer customer);
}
