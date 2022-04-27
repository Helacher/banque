package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
  import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@RequiredArgsConstructor
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmploye;
	@NonNull
	private String nomEmploye;

	@ManyToOne
	@JoinColumn(name="Code_emp_sup" )
	private Employee EmployesSup;
	@ManyToMany
	@JoinTable(name="Emp_Gr", joinColumns=
	@JoinColumn(name="Num_EMP"), inverseJoinColumns=
	@JoinColumn (name="Num_Groupe"))
	private Collection<Groupe> groupes;}
