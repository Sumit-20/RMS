package com.example.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.model.Rules;
import com.example.repository.ApplicationRepository;
import com.example.repository.CompanyRepository;
import com.example.repository.FaRepository;
import com.example.repository.RulesEngineRepository;
import com.example.repository.RulesRepository;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
class FaServiceImplTest {
	
	@MockBean
	private CompanyRepository cr;
	
	@MockBean
	private RulesEngineRepository rer;
	
	@MockBean
	private ApplicationRepository ar;
	
	@MockBean
	private FaRepository fr;
	
	@MockBean
	private RulesRepository rr;
	
	@InjectMocks
	private FaServiceImpl service;

	@Test
	void testSubmitForm() {
		List<String> li=List.of("approved","rejected");
		when(ar.checkHistory("Poornima1323")).thenReturn(li);
		Rules rule=new Rules(3, "Poornima1323",7000.0, 4444400.0,4444400.0,550.0);
		assertEquals(true,service.submitForm(rule));
	}

//	@Test
//	final void testSaveApplication() {
//		fail("Not yet implemented");
//	}

	@Test
	void testLogin() {
		
		service.login("piku123", "123");
		verify(fr).findByfaUserNameAndPassword("piku123", "123");
	}

	@Test
	void testFetchAllApplications() {
		
		service.fetchAllApplications();
		verify(rr).getApplications();
	}

	@Test
	void testGetDetails() {

        service.getDetails(1);
        verify(rr).getByApplicationId(1);
	}

	@Test
	final void testEvaluate() {
		when(rer.maxAmount()).thenReturn(1000000.0);
		when(rer.minAmount()).thenReturn(1000.0);
		when(rer.maxDebt()).thenReturn(50000.0);
		when(rer.minExperience()).thenReturn(12.0);
		when(rer.minNetWorth()).thenReturn(200000.0);
		when(rer.minRevenue()).thenReturn(200000.0);
		Rules rule=new Rules(3,"Poornima1323",7000.0, 4444400.0,4444400.0,550.0);
		assertEquals(false,service.evaluate(rule));
	}

//	@Test
//	final void testSetApplicationStatus() {
//		fail("Not yet implemented");
//	}

	@Test
	void testFetchApplicationHistory() {
		
		service.fetchApplicationHistory();
		verify(ar).getApplicationHistory();
		
	}

}
