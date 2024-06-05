package com.strings;

//Strong password
public class Assignment {

	public static void main(String[] args) {
		String s1="Hello@Java$123";
		int count1=0,count2=0,count3=0,count4=0;
		for(int i=0;i<s1.length();i++)
		{
			//System.out.println(s1.charAt(i));
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count1++;
			}
			else if(ch>='a' && ch<='z')
			{
				count2++;
			}
			else if(ch>='0' && ch<='9')
			{
				count3++;
			}
			else
			{
				count4++;
			}
		}
		System.out.println("Capital letters are "+count1);
		System.out.println("Small letters are "+count2);
		System.out.println("Total digit are "+count3);
		System.out.println("Special characters are "+count4);
		if(count1>=1 && count2>=1 && count3>=1 && count4>=1 && s1.length()>=8)
		{
			System.out.println("Strong password");
		}
		else {
			System.out.println("Invalid passsword");
		}
	}

}
