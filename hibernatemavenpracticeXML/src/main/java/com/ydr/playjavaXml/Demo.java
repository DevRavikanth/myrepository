package com.ydr.playjavaXml;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Demo {
	
	//@Id
	//@GeneratedValue
	private int Id;
	private String demoname;
	private int datanumber;
	
	
	
	public Demo() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDemoname() {
		return demoname;
	}
	public void setDemoname(String demoname) {
		this.demoname = demoname;
	}
	public int getDatanumber() {
		return datanumber;
	}
	public void setDatanumber(int datanumber) {
		this.datanumber = datanumber;
	}
	@Override
	public String toString() {
		return "Demo [Id=" + Id + ", demoname=" + demoname + ", datanumber=" + datanumber + "]";
	}
	

}
