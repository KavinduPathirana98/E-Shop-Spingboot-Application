package com.eshop.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.demo.entity.admin;
import com.eshop.demo.entity.customer;

public interface customerRepository extends JpaRepository<customer,Integer>  {

	public customer email(String email);

	public customer findByEmailAndPassword(String email,String password);
}
