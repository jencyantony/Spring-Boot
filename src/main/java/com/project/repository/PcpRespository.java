package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Population;

@Repository
public interface PcpRespository extends JpaRepository<Population, Integer>{

	public List<Population> findByRecipientId(int recipientId);
}
