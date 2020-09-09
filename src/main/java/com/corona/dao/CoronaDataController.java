package com.corona.dao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoronaDataController {
	
	@RequestMapping(value="/hiThere",method = RequestMethod.POST)
	public String value() {
		return "samplestring";
	}
	

}
