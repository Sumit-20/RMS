package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer>{

	Company findByUserNameAndPassword(String userName, String pass);

	Company findByUserName(String user);

}
