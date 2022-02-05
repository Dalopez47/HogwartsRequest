package com.register.students.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 20)
	private String name;
	
	@Column(length = 20)
	private String surname;
	
	@Column(length = 10, unique = true )
	private int documentId;
	
	@Column(length = 2)
	private int age;
	

	private String home;
		

	public User() {
		super();
	}



	
	public User(int id, String name, String surname, int documentId, int age, String home) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.documentId = documentId;
		this.age = age;
		this.home = home;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	

	public int getDocumentId() {
		return documentId;
	}


	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
	
	
	

}
