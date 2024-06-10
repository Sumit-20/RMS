package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Repository;

import com.example.model.Fa;

@Repository
public interface FaRepository extends JpaRepository<Fa,Integer>{

	Fa findByfaUserNameAndPassword(String faUserName, String pass);

	Fa findByfaUserName(String user);
	
}
