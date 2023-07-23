package classobjectandmethod;

import java.util.Scanner;

public class me1 {

	public int add(int num1,int num2) {
		
		int num3 = num1 + num2;
		return num3;
		}
	public static void main(String[] args) {
		typeofmethod typeofmethod = new typeofmethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no");
		int num1=sc.nextInt();
		System.out.println("enter second no");
        int num2= sc.nextInt();
		
        int result = typesofmethod.add(num1,num2);
		System.out.println("addition of a and b" +result);
				
				
	}
}
