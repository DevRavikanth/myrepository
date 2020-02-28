package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MapfiledsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapFileds mf = new MapFileds();
		ArrayList<String> al = new ArrayList<String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		al.add("9848313423");
		al.add("9848353423");
		al.add("9848373423");
		al.add("9848413423");
		al.add("9848353423");
		mf.setContactNUm(al);
		hm.put("ravi", "lahari");
		hm.put("kavi", "ljiari");
		hm.put("buvi", "jigani");
		hm.put("savi", "japthri");
		hm.put("navi", "Qw@#4U");
		hm.put("pravi", "SjskRty");
		mf.setuCredentials(hm);
		
		
		
		
		System.out.println(mf.getContactNUm());
		System.out.println(mf.getuCredentials());
		

	}

}
