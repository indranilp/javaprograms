package Interview;

public class Substringprogram1 {
	
	public boolean checkSubtring(String s)
	{
		StringBuffer s1= new StringBuffer();
		s1.append(s);
		//System.out.println(s1);
		//System.out.println(s1.reverse());
		String s2 = s1.reverse().toString();
		if(s.equals(s2))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abaaa";
		for(int i=0; i< s.length();i++)
	    {
			for(int j=i+1; j<=s.length();j++)
			{
				
			Substringprogram1 obj1 = new Substringprogram1();
			boolean status = obj1.checkSubtring(s.substring(i, j));
			//System.out.println(s.substring(i, j));	
			if (status == true)
			{
				System.out.println(s.substring(i, j));		
			}
				
		}
			
	    }
	}

}
