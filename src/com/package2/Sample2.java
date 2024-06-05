package com.package2;

import com.package1.Demo;

//For protected
class Demo1 extends Demo{
	void show()
	{
		display();
	}
}
public class Sample2 {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.show();
	}

}
/*
//For public
public class Sample2 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
	}

}*/