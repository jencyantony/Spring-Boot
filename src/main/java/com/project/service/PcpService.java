package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Population;
import com.project.repository.PcpRespository;

@Service
public class PcpService {

	@Autowired
	private PcpRespository repository;
	
	public List<Population> getAllEnrolledPopulation(){
		List<Population> enrolledPopulation = new ArrayList<Population>();
		repository.findAll().forEach(enrolledPopulation::add);
		return enrolledPopulation;
	}
	
	public List<Population> getEnrolledPopulationById(int recepientId){
		return repository.findByRecepientId(recepientId);
	}
}
