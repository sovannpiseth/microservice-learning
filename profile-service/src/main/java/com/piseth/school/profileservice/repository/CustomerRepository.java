package com.piseth.school.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piseth.school.rentcloudcommon.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
