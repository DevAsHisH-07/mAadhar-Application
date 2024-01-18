package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.AdminUser;
import com.example.repo.AdminRepo;

@Service
public class AdminService {
	@Autowired
	AdminRepo repo;

	public AdminUser addAdmin(AdminUser adminUser) {
		return repo.save(adminUser);
	}

	public List<AdminUser> getAllAdmin() {
		return repo.findAll();
	}

	public AdminUser getAdminByEmail(String email) {
		return repo.findByEmail(email);
	}

	public AdminUser editAdmin(AdminUser adminUser) {
		return repo.save(adminUser);
		
	}

	public AdminUser getAdminByEmailAndPassword(String email, String password) {
		return repo.findByEmailAndPassword(email,password);
	}
}
