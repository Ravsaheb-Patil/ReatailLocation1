package dicisionmakingstatement;

import java.util.Scanner;

public class switchdem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to the sbi ATM");
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("press 1 for withdraw money");
		System.out.println("press 2 for  deposite money");
		System.out.println("press 3 for for balace enquiry");
	
	
	int ch = sc.nextInt();
	switch(ch) {
	
	case 1 :
		System.out.println("withdraw successful");
		
		break;
	case 2:
		System.out.println("deposite successful");
		break;
	case 3 :
		System.out.println("your balance is 3000 rs");
	
		break ;
		
		default:
			
			System.out.println(" invalid input");
			
			
			
			break;
	}
	
	
	
	}

}
