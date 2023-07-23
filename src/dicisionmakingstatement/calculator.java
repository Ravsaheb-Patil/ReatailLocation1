package dicisionmakingstatement;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
	System.out.println("press 1  for addition");
	System.out.println("press 2 for sub");
	System.out.println("press 3 for mul");
	System.out.println("press 4 for div");
	System.out.println("press 5 for mod");
		
	Scanner Sc = new Scanner(System.in); 
	 
	int choice = Sc.nextInt();
	
	switch(choice) {
	
	case 1:
		 System.out.println("enter first number");
		 
		 int num1 = Sc.nextInt();
		 
		 System.out.println("enter second number");
		 
		 int num2 = Sc.nextInt();
		 
		 int result = num1 + num2;
		 System.out.println("addition of num1 + num2 is" + result);
		 break;
		 
	case 2:
		System.out.println("enter first number");
		
		int num3 = Sc.nextInt();
		
		System.out.println("emter the second number");
		int num4 = Sc.nextInt();
		
		int result1 = num3+num4;
		System.out.println("sub of num1 and num2 is:" + result1);
		
		break;
	
	case 3:
		break;
	case 4 :
		break;
	case 5:
		default:System.out.println("invalid choice");
		
		break;
		
		
		
		
		
		 
		 
		 
	
	
	
	
	}
	
	
	}

}
