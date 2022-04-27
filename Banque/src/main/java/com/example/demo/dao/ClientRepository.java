package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Client;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository <Client, Long> {
	//List<Client>findAll();
	List<Client> findByNom(@Param("nomClient") String nomClient);
}
