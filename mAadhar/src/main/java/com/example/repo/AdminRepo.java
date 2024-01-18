package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.pojo.AdminUser;

public interface AdminRepo extends JpaRepository<AdminUser, Long> {
	
	public AdminUser findByEmail(String email);
	
	@Query("SELECT admin FROM AdminUser admin WHERE admin.email=?1 AND admin.password=?2")
	public AdminUser findByEmailAndPassword(String email, String password);
}
