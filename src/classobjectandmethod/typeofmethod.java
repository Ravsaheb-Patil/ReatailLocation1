package classobjectandmethod;

import java.util.Scanner;

public class typeofmethod{
	public void add() {
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter first no");
	int num1=Sc.nextInt();
	System.out.println("enter second no");
	int nun2 = Sc.nextInt();
	int num3=num1+nun2;
	System.out.println("addition of num1 and num2=" + num3);
	
	}
	    public static void main(String[] args) {
		typeofmethod typeofmethod = new typeofmethod();
	    typeofmethod.add();
			
		}
}
	
	
	
	

