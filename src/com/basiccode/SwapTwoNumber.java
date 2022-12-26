package com.basiccode;
import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter first number: ");
       int first=sc.nextInt();
       System.out.println("Enter second number: ");
       int second=sc.nextInt();
       int convert;
       convert=first;
       first=second;
       second=convert;
       System.out.println("First number: "+first);
       System.out.println("Second number: "+second);

	}

}
