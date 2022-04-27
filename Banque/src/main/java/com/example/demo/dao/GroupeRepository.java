package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Groupe;

public interface GroupeRepository extends JpaRepository <Groupe, Long> {

}
