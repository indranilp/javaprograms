package arraylistdemo;

import java.util.*;
public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int c=10/0;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("error");
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("hello");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("end");
		}
		
		

	}

}
