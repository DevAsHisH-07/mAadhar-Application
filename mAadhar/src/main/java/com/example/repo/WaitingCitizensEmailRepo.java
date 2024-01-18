package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.WaitingCitizensEmail;

public interface WaitingCitizensEmailRepo extends JpaRepository<WaitingCitizensEmail, String> {

}
