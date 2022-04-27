package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_CPT",
discriminatorType=DiscriminatorType.STRING, length=2)
public abstract class Compte implements Serializable{
	
	@Id
	private String codeCompte;
	
	private Date dateCreation;
	@NonNull
	private double solde;
	
	@ManyToOne
	@JoinColumn(name="Code_Cli")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="Code_Emp")
	private Employee employe;
	
	@OneToMany( mappedBy="compte")
	private Collection <Operation> operations;

}
