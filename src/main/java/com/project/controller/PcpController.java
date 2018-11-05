package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Population;
import com.project.service.PcpService;

@RestController
@CrossOrigin(origins = "*")
public class PcpController {

	@Autowired
	private PcpService pcpService;
	
	@GetMapping(value= "/getEnrolledPopulation")
	public List<Population> getAllEnrolledPopulation(){
		return pcpService.getAllEnrolledPopulation();
	}
	
	@GetMapping(value= "/getEnrolledPopulationById")
	public List<Population> getEnrolledPopulationById(@RequestParam("recipientId") int recipientId){
		return pcpService.getEnrolledPopulationById(recipientId);
	}
}
