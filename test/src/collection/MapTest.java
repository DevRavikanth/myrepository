package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> hm = new HashMap<Object, Object>();
		
		hm.put(null, null);
		hm.put(null,null);
		hm.put(null, null);
		hm.put(null, 34);
		hm.put(10, 2345);
		hm.put(10,5678);
		hm.put(10, 4635);
		hm.put(10, 2347);
		
		
		System.out.println(hm.get(null));
			
;	}

}
