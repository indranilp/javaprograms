package arraylistdemo;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> obj1 = new HashSet<String>();
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
