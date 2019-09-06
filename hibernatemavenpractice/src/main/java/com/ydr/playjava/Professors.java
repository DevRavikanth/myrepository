package com.ydr.playjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Professors {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@OneToMany
	private Collection<Subjects> subjects = new ArrayList<Subjects>();
	
	
	
	public Collection<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(Collection<Subjects> subjects) {
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
