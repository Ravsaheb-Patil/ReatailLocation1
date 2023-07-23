package classobjectandmethod;

import java.util.Scanner;

public class m2 {
	public void add(int num1,  int num2 ) {
		
		int num3 = num1 + num2;
		System.out.println("addition of num1 and num2 =" + num3);
		
	}
	public static void main(String[] args) {
		typeofmethod typeofmethod= new typeofmethod();
		
		Scanner Sc = new Scanner(System.in);
	System.out.println("enter first no");
	int num1 = Sc.nextInt();
	
	  System.out.println("enter second no");
	  int num2 = Sc.nextint();

      typeofmethod.add(num1,num2);
	
	}

}
