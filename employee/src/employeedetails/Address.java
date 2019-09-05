package employeedetails;

public class Address {
	
	private String city;
	private int contactNumber;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address(String city, int contactNumber) {
		super();
		this.city = city;
		this.contactNumber = contactNumber;
	}

}
