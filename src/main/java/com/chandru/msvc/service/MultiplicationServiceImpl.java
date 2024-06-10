package com.chandru.msvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.chandru.msvc.domain.Multiplication;

public class MultiplicationServiceImpl implements MultiplicationService {
	private RandomGeneratorService randomGeneratorService;

	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		this.randomGeneratorService = randomGeneratorService;
	}

	@Override
	public Multiplication createRandomMultiplication() {
		int factorA = randomGeneratorService.generateRandomFactor();
		int factorB = randomGeneratorService.generateRandomFactor();
		return new Multiplication(factorA, factorB);
	}
}
