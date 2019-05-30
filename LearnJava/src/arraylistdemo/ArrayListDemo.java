package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList myArrayList = new ArrayList();
		myArrayList.add(123);
		myArrayList.add("xyz");
		System.out.println(myArrayList);
		int size = myArrayList.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(myArrayList.get(i));
			
		}
		
		for(Object abc: myArrayList)
		{
			System.out.println(abc);
		}
		
		Iterator itr1 = myArrayList.iterator();
		while(itr1.hasNext())
		{
			Object value = itr1.next();
			System.out.println(value);
		}
	}
	

}
