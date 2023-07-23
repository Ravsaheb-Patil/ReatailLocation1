package addition;

import java.util.Scanner;

public class booleandemo {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		System.out.println("enter boolean value");
		
	Boolean b = user.nextBoolean();
	
	System.out.println("the boolean value  is ="+b);
	
	
	}
	
	
	
	package classobjectandmethod;

	import java.util.Scanner;

	public class asdm {
	public void add() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("enter value of a ");
		
		int a = sc.nextInt();
		
		System.out.println("enter second number");
		
		int b = sc.nextInt();
		
		int c = a + b ;
		
		System.out.println("addition of a and b is : "+c);
		
	}

	public void sub () {
	    
		Scanner sc = new Scanner(System.in); 
		
		 System.out.println("enter value of a ");
	     
		 int a = sc.nextInt();
		
		 System.out.println("enter second number");
		
		 int b = sc.nextInt();
		
		 int c = a - b ;
		
		System.out.println("sub of a and b is :"+ c);
		
		
	}

	public void div() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter value of a ");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		int c = a / b ;
		System.out.println("div of a and b is :"+ c);
	}


	public void mul() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter value of a ");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		int c = a * b ;
		
	}

	public static void main(String[] args) {
		 asdm a = new asdm();
		 a.add();
		 a.sub();
	     a.div();
	     a.mul();
	
}
