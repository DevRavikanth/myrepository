package com.ydr.playjava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class SubjectsM2O {

	@Id
	@GeneratedValue
	private int id;
	
	private String subjectname;
	@ManyToOne 
	@JoinColumn(name="profid") 
	private ProfessorsO2M prof;
	
	public ProfessorsO2M getProf() {
		return prof;
	}
	public void setProf(ProfessorsO2M prof) {
		this.prof = prof;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
}
