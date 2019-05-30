package arraylistdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> obj1 = new HashMap<String, String>();
		obj1.put("1", "one");
		obj1.put("2", "two");
		obj1.put("3", "three");
		obj1.put("4", "four");
		
		System.out.println(obj1);
		
		String value=obj1.get("1");
		System.out.println(value);
		
		for(Map.Entry<String, String> abc: obj1.entrySet())
		{
			System.out.println(abc.getKey() + abc.getValue());
			
		}

	}

}
