package springBootTest;



class A{

	{
		System.out.println("A's instanse block");
	}
	static{
		System.out.println("A's static block");
	}
	
	A(){
		System.out.println("A's constructor");
	}
}

class B extends A{

	{
		System.out.println("B's instanse block");
	}
	static{
		System.out.println("B's static block");
	}
	
	B(){
		System.out.println("B's constructor 1111");
	}
}

public class Test extends B{

	{
		System.out.println("CallTest's instanse block 11112222");
	}
	static{
		System.out.println("CallTest's static block");
	}
	
	Test(){
		System.out.println("CallTest's constructor");
	}
	public static void main(String[] args) {
		
		System.out.println("Before");
		new Test();
		System.out.println("After");
	}

}

