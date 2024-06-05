package com.exception;

class AgeValidation{
	void valid(int age) throws Exception
	{
		if(age>=18)
		{
			System.out.println("Valid age");
		}
		else {
			throw new Exception("Invalid age");
		}
	}
}
public class UserException {

	public static void main(String[] args) {
		AgeValidation a=new AgeValidation();
		try {
			a.valid(12);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
