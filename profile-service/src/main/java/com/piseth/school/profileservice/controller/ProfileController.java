package com.piseth.school.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piseth.school.profileservice.service.CustomerService;
import com.piseth.school.rentcloudcommon.model.Customer;

@RestController
@RequestMapping(value = "/service")
public class ProfileController {
	@Autowired
	CustomerService customerService;

	public Customer save(@RequestBody Customer customer) {

		return customerService.save(customer);
	}
}
