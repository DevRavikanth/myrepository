package com.ydr.playjava;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProfessorsO2M {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy="prof")
	private Collection<SubjectsM2O> subjects = new ArrayList<SubjectsM2O>();
	
	
	

	public Collection<SubjectsM2O> getSubjects() {
		return subjects;
	}
	public void setSubjects(Collection<SubjectsM2O> subjects) {
		this.subjects = subjects;
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

}
