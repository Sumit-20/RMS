package com.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.model.Fa;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
class FaRepositoryTest {

	@Autowired
	private FaRepository fr;
	
	@Test
    void testFindByfaUserNameAndPassword() {
		
		Fa obj=fr.findByfaUserNameAndPassword("piku123", "123");
		assertNotNull(obj);
		Assertions.assertThat(obj.getFaUserName()).isEqualTo("piku123");
		Assertions.assertThat(obj.getPassword()).isEqualTo("123");
	}

}
