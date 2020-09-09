package com.corona.coronaData;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/corona")
public class CoronaDataController {
	
	@Autowired
	CoronaDataAPIRespository coronaDataAPIRespository;
	
	@RequestMapping(value="/alldata", method = RequestMethod.GET)
	public List<Corona_data_state_collection> initialDataSet(){
		
		coronaDataAPIRespository.findAll();
		System.out.println(coronaDataAPIRespository.findAll());
		return coronaDataAPIRespository.findAll();
		
	}
	
	@RequestMapping(value="/selectedState/{countryCode}",method=RequestMethod.GET)
	public Optional<Corona_data_state_collection>  selectedState(@PathVariable  String countryCode){
		
		coronaDataAPIRespository.findById(countryCode);
		return coronaDataAPIRespository.findById(countryCode);
	}

}
