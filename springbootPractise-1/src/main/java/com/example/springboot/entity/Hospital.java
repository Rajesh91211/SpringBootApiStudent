package com.example.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="Hospital_Details")
public class Hospital 
{
	//Feilds Genaration
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="P_Number")
	private Long paitientNumber;
	
	@Column(name="Hosp_Name")
	private String hospitalName;
	
	@Column(name="Hosp_Place")
	private String hospitalPlace;

	
	public Long getPaitientNumber() {
		return paitientNumber;
	}

	public void setPaitientNumber(Long paitientNumber) {
		this.paitientNumber = paitientNumber;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalPlace() {
		return hospitalPlace;
	}

	public void setHospitalPlace(String hospitalPlace) {
		this.hospitalPlace = hospitalPlace;
	}

	@Override
	public String toString() {
		return "Hospital [paitientNumber=" + paitientNumber + ", hospitalName=" + hospitalName + ", hospitalPlace="
				+ hospitalPlace + "]";
	}
	
	
	
	
}
