package dicisionmakingstatement;

import java.util.Scanner;

public class Nestedifdem {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("enter value of first number");
	
	int a = sc.nextInt();
	
	System.out.println("enter value of sencond number");
	
	int b = sc.nextInt();
	
	System.out.println("enter the third number");
	
	int c = sc.nextInt();
	
	if (a>b) {
		
		if (a>c)   {
			
			System.out.println(a);
		}else {
			
			System.out.println(c);
		
		}
		
	}else{
		
		if(b>c) {
			System.out.println(b);
		}else {
			
			System.out.println(c);
		
		
		}
		}
	}
	

}
