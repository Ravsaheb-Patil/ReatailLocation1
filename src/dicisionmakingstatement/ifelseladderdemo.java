package dicisionmakingstatement;

import java.util.Scanner;

public class ifelseladderdemo {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter your mark");
	 int marks = sc.nextInt();
	 
	 if(marks>100){
		 System.out.println("invalid input");
	 }else if(marks<80) {
		 System.out.println("A grade");
	 }else if(marks>=60 && marks<80) {
		 System.out.println("B");
	 }else if (marks<=40 && marks<60) {
		 System.out.println("c");
	 }else {
		 System.out.println("you are not eligible for  taking addmision in next class");
		 
		 
	 }
}

}
