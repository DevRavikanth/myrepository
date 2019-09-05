package employeedetails;

public class Employee {
	private String ename;
	private int empId;
	private Address adr;
	public Employee(String ename, int empId, Address adr) {
		//super();
		this.ename = ename;
		this.empId = empId;
		this.adr = adr;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	


}
