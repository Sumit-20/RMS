package com.example.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.model.Application;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
class ApplicationRepositoryTest {

	@Autowired
	private ApplicationRepository ar;
	
	@Test
	void testGetByApplicationId() {
		
		Application ap=ar.getByApplicationId(1);
		assertNotNull(ap);
		Assertions.assertThat(ap.getUserName()).isEqualTo("Poornima1323");
	}

	@Test
	void testGetByUserName() {
		
		List<Application> li=ar.getByUserName("Poornima1323");
		Assertions.assertThat(li).extracting(Application::getUserName).contains("Poornima1323");
	    
	}

	@Test
	void testGetApplicationHistory() {
	
		List<Application> li=ar.getApplicationHistory();
		Assertions.assertThat(li).extracting(Application::getStatus).containsAnyOf("approved","rejected");
	}

	@Test
	void testCheckHistory() {
		
		List<String> li=ar.checkHistory("Poornima1323");
		Assertions.assertThat(li).containsAnyOf("rejected","approved").hasSize(2);
		System.out.println(li);
	}

}
