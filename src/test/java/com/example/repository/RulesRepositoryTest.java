package com.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.model.Rules;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
class RulesRepositoryTest {

	@Autowired
	private RulesRepository rr;
	
	@Test
	void testGetApplications() {
		
		List<Rules> li=rr.getApplications();
		Assertions.assertThat(li).hasSize(2);
	}

	@Test
	void testGetByApplicationId() {
		
		Rules actualResult=rr.getByApplicationId(1);
		assertNotNull(actualResult);
		Assertions.assertThat(actualResult.getUserName()).isEqualTo("Poornima1323");
		
	}

}
