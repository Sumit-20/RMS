package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.model.Rules;

@Repository
public interface RulesEngineRepository extends JpaRepository<Rules,Integer>{

	@Query(value="SELECT limits from rule_engine where conditions='amount' and parameters='max'",nativeQuery=true)
	Double maxAmount();
	
	@Query(value="SELECT limits from rule_engine where conditions='amount' and parameters='min'",nativeQuery=true)
	Double minAmount();
	
	@Query(value="SELECT limits from rule_engine where conditions='debt' and parameters='max'",nativeQuery=true)
	Double maxDebt();
	
	@Query(value="SELECT limits from rule_engine where conditions='experience' and parameters='min'",nativeQuery=true)
	Double minExperience();
	
	@Query(value="SELECT limits from rule_engine where conditions='revenue' and parameters='min'",nativeQuery=true)
	Double minRevenue();
	
	@Query(value="SELECT limits from rule_engine where conditions='netWorth' and parameters='min'",nativeQuery=true)
	Double minNetWorth();
}
