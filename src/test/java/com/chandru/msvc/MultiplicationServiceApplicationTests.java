package com.chandru.msvc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.chandru.msvc.domain.Multiplication;
import com.chandru.msvc.service.MultiplicationService;
import com.chandru.msvc.service.RandomGeneratorService;

@SpringBootTest
class MultiplicationServiceApplicationTests {

	@MockBean
	private RandomGeneratorService randomGeneratorService;
	@Autowired
	private MultiplicationService multiplicationService;

	@Test
	public void createRandomMultiplicationTest() {
		// given (our mocked Random Generator service will return first 50, then 30)
		// given(randomGeneratorService.generateRandomFactor()).
		// willReturn(50, 30);
		// when

		Multiplication multiplication = multiplicationService.createRandomMultiplication();

		// then
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);
	}

}
