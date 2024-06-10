package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Application;
import com.example.model.Rules;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Integer>{

	Application getByApplicationId(int id);

	List<Application> getByUserName(String userName);

	@Query(value="select * from application_details where status='rejected' or status='approved'",nativeQuery=true)
	List<Application> getApplicationHistory();

	@Query(value="select status from application_details where user_name=?1",nativeQuery=true)
	List<String> checkHistory(String user);

}
