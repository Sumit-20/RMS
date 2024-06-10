package com.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
class RulesEngineRepositoryTest {

	@Autowired
	private RulesEngineRepository rer;
	
	@Test
	void testMaxAmount() {
		
		int amount=1000000;
		Assertions.assertThat(rer.maxAmount()).isEqualTo(amount);
	}

	@Test
	void testMinAmount() {
		int amount=1000;
		Assertions.assertThat(rer.minAmount()).isEqualTo(amount);
	}

	@Test
	void testMaxDebt() {
		int amount=50000;
		Assertions.assertThat(rer.maxDebt()).isEqualTo(amount);
	}

	@Test
	void testMinExperience() {
		int experience=12;
		Assertions.assertThat(rer.minExperience()).isEqualTo(experience);
	}

	@Test
	void testMinRevenue() {
		int amount=200000;
		Assertions.assertThat(rer.minRevenue()).isEqualTo(amount);
	}

	@Test
	void testMinNetWorth() {
		int amount=200000;
		Assertions.assertThat(rer.minNetWorth()).isEqualTo(amount);
	}

}
