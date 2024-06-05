package com.exception;

class ValidPassword{
	void valid() throws Exception
	{
		String s1="1234567";
		if(s1.length()>=8)	
		{
			System.out.println("Valid password");
		}
		else {
			throw new Exception("Invalid password");
		}
	}
}
public class UserException1 {

	public static void main(String[] args) {
		ValidPassword v=new ValidPassword();
		try {
			v.valid();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
