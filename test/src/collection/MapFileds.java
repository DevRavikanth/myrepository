package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapFileds {
	
	
	
	
	private ArrayList<String> contactNUm ;
	private HashMap<String,String> uCredentials;

	public HashMap<String, String> getuCredentials() {
		return uCredentials;
	}

	public void setuCredentials(HashMap<String, String> uCredentials) {
		this.uCredentials = uCredentials;
	}

	public ArrayList<String> getContactNUm() {
		//return contactNUm;
		return new ArrayList<String>(this.contactNUm);  

	}

	public void setContactNUm(ArrayList<String> contactNUm) {
		//this.contactNUm = contactNUm;
		this.contactNUm = new ArrayList<String>(contactNUm);
	}
	
	
}
