package com.project.PCPProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.project.controller", "com.project.service"})
@EntityScan("com.project.model")
@EnableJpaRepositories("com.project.repository")
public class PcpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcpProjectApplication.class, args);
	}
}
