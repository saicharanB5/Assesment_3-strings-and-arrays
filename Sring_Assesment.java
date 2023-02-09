package dxc;

public class Sring_Assesment {
	
	static String moveSpecialCharacters(String s)
	{
		String str1="",str2="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if (c>64 && c<=90 || c>96 && c<=122)
			{
				str1=str1+c;
			}
			else
			{
				str2=str2+c;
			}
		}
		return str1+str2;
	}

	public static void main(String[] args) {
		
		String s1 = "He@#$llo!*&";
		String s2="%$Wel*&come!";
		 System.out.println(moveSpecialCharacters(s1));
		 System.out.println(moveSpecialCharacters(s2));

		

	}

}