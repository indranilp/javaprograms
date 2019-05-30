package arraylistdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> obj1 = new TreeSet<String>();
		obj1.add("abc");
		obj1.add("lmn");
		obj1.add("xyz");
		obj1.add("pqr");
		
		for(String x: obj1)
		{
			System.out.println(x);
		}
 
		Iterator itr1 = obj1.iterator();
		while(itr1.hasNext())
		{
			Object value = itr1.next();
			System.out.println(value);
		}
			
		
	}

}
