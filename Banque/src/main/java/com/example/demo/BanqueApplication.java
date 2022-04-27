package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ClientRepository;
import com.example.demo.dao.CompteRepository;
import com.example.demo.dao.EmployesRepository;
import com.example.demo.dao.GroupeRepository;
import com.example.demo.dao.OperationRepository;

@SpringBootApplication
public class BanqueApplication {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployesRepository employesRepository;
	@Autowired
	private GroupeRepository groupeRepository;
	@Autowired
	private OperationRepository operationRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}

}
