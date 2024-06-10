package com.example.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.model.Company;
import com.example.repository.ApplicationRepository;
import com.example.repository.CompanyRepository;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
class CompanyServiceImplTest {

	@MockBean
	private CompanyRepository cr;
	
	@MockBean
	private ApplicationRepository ar;
	
	@InjectMocks
	private CompanyServiceImpl service;
	
    @Test
	void testLogin() {
    	service.login("Poornima1323","123");
		verify(cr).findByUserNameAndPassword("Poornima1323","123");
	}

	@Test
	void testApplicationStatus() {
		
		service.applicationStatus("Poornima1323");
		verify(ar).getByUserName("Poornima1323");
	}

}
