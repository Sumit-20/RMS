package com.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.model.Company;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
class CompanyRepositoryTest {
	
	@Autowired
	private CompanyRepository cr;

	@Test
	void testFindByUserNameAndPassword() {
		
		Company com=cr.findByUserNameAndPassword("Poornima1323","12");
		assertNotNull(com);
	}
	

}
