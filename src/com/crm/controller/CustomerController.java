package com.crm.controller;

import com.crm.pojo.Customer;
import com.crm.service.CustomerService;
import com.crm.service.impl.CustomerServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/crm")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/add")
    public String addCustomer(Customer customer, Model model) {
        System.out.println(customer);
        System.out.println(customerService);
        boolean b = customerService.insertCustomer(customer);
        if (b = true) {
            model.addAttribute("msg", "成功");
        } else {
            model.addAttribute("msg", "失败");
        }
        return "msg";
    }

    @RequestMapping(value = "/list")
    public String queryCustomer(Model model) {
        List<Customer> customers = customerService.queryAll();
        model.addAttribute("page", customers);
        return "list";
    }

    @RequestMapping("/edit/{cid}")
    public String queryById(@PathVariable("cid") int cid, Model model) {
        Customer customer = customerService.queryById(cid);
        model.addAttribute("cus", customer);
        return "edit";
    }

    @RequestMapping("/update")
    public String update(Customer customer, Model model) {
        boolean b = customerService.updateCustomer(customer);
        if (b = true) {
            model.addAttribute("msg", "成功");
        } else {
            model.addAttribute("msg", "失败");
        }
        return "msg";
    }

    @RequestMapping("/del/{id}")
    public String delCustomer(@PathVariable("id") int id, Model model) {
        boolean b = customerService.delCustomer(id);
        if (b = true) {
            model.addAttribute("msg", "成功");
        } else {
            model.addAttribute("msg", "失败");
        }
        return "msg";
    }

    @RequestMapping("/search")
    public String searchCustomer(Customer customer, Model model) {
        List<Customer> customers = customerService.searchCustomer(customer);
        model.addAttribute("page", customers);
        return "list";
    }
}
