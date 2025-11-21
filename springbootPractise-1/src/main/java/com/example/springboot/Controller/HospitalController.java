package com.example.springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.entity.Hospital;
import com.example.springboot.service.HospitalService;

@RestController
@RequestMapping("/Hospital")
public class HospitalController 
{
	//Dependency injection
	@Autowired
	private HospitalService hospService;
	
	//insertion of hospital details
	
	@PostMapping("/insert")
	public ResponseEntity<Hospital> insertHospital(@RequestBody Hospital hosp )
	{
	Hospital hs=hospService.saveHospitalRecord(hosp);
		
		return new ResponseEntity<Hospital>(hs,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getTotal")
	public ResponseEntity<List<Hospital>> getAllHospital()
	{
		List<Hospital> allHospitalRecords = hospService.getAllHospitalRecords();
		
		if (allHospitalRecords.isEmpty())
		{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		}
		return new ResponseEntity<List<Hospital>>(allHospitalRecords,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/get/{number}")
    public ResponseEntity<Hospital> getHospitalRecordByID(@PathVariable("number") Long paitientNumber) {
        Optional<Hospital> hosp = hospService.getHospitalId(paitientNumber);
        return hosp.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	

}
}
