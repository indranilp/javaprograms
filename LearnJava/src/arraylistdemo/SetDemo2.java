package arraylistdemo;

import java.util.LinkedHashSet;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> obj1 = new LinkedHashSet<String>();
		obj1.add("abc");
		obj1.add("lmn");
		obj1.add("xyz");
		obj1.add("pqr");
		
		for(String x: obj1)
		{
			System.out.println(x);
		}
 
	}

}
