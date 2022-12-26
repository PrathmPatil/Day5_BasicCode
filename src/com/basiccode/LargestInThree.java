package com.basiccode;
import java.util.Scanner;

public class LargestInThree {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Three Number:- ");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 
		 if(a>b && b>c)
		 {
			 System.out.println("The Number "+a+" is greter than "+b+" & "+c);
		 }
		 if(b>a && a>c)
		 {
			 System.out.println("The Number "+b+" is greter than "+a+" & "+c);
		 }
		 else
		 {
			 System.out.println("The Number "+c+" is greter than "+b+" & "+a);
		 }
	}

}
