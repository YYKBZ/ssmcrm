package com.crm.dao;

import com.crm.pojo.Customer;

import java.util.List;

public interface CustomerDao {

    /*添加客户*/
    int insertCustomer(Customer customer);

    /*查询所有*/
    List<Customer> queryAll();

    /*根据id查询*/
    Customer queryById(int cid);

    /*根据条件查询*/
    List<Customer> queryTerm(Customer customer);

    /*根据id删除*/
    int deleteId(int cid);

    /*修改用户*/
    int updateCustomer(Customer customer);

    /*根据id删除用户*/
    int delCustomer(int cid);


    /*高级搜索*/

    List<Customer> searchCustomer(Customer customer);
}
