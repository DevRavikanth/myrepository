package employeedetails;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address adr = new Address("Bangalore",40897);
		Employee e = new Employee("ravikanth",123,adr);
		
		 System.out.println(e.getEmpId());
		 System.out.println(e.getAdr().getCity());
		 System.out.println(e.getAdr().getContactNumber());
		 System.out.println(adr);

	}

}
