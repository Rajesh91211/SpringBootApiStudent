package com.example.springboot.repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Hospital;

@Repository
public interface HospitalRepository1 extends JpaRepository<Hospital, Long> 
{

}
