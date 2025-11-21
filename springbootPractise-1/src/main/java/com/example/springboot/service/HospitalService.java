package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Hospital;
import com.example.springboot.repoistory.HospitalRepository1;

@Service
public class HospitalService 
{
	@Autowired
	private HospitalRepository1 hospRepository1;
	
	//create hospital record
	
	public Hospital saveHospitalRecord(Hospital hosp)
	{
		
		return hospRepository1.save(hosp);
		
	}
	
	//get all hospital records
	
	public List<Hospital> getAllHospitalRecords()
	{
		return hospRepository1.findAll() ;
		
	}
	
	// Get a Bank record by ID
    public Optional<Hospital> getHospitalId(Long paitientNumber) {
        return hospRepository1.findById(paitientNumber);
    }
	

}
