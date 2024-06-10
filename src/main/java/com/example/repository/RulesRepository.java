package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.model.Rules;

@Repository
public interface RulesRepository extends JpaRepository<Rules,Integer>{

	@Query(value="SELECT * FROM company_details c INNER JOIN loan_applications r ON c.user_name=r.user_name WHERE r.application_id IN (SELECT application_id FROM application_details WHERE STATUS='pending' )",nativeQuery=true)
	List<Rules> getApplications();

	Rules getByApplicationId(int id);
	
}
