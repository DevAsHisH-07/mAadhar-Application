package com.example.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.AadharCard;
import com.example.repo.AadharCardRepo;

@Service
public class AadharCardService {
	@Autowired
	AadharCardRepo repo;
	public String randomAadharNumberGenerator() {
		Random random=new Random();
		long aadharNumber=100_000_000_000L+(random.nextLong()%100_000_000_000L);
		return String.format("%012d", aadharNumber);
	}
	public void addAadhar(AadharCard aadharCard) {
		repo.save(aadharCard);		
	}
}
