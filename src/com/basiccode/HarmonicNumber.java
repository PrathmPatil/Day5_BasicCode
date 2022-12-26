package com.basiccode;
import java.util.Scanner;

public class HarmonicNumber {
  
	static double n;
	
    public void harmonicNumber(double n)
    {	
    double cal=0;
    	while(n!=0) {
    		cal=cal+(1/n);
    		n--;
    	}
    	System.out.println("Total Harmonic is "+cal);
    }
	public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         HarmonicNumber hn=new HarmonicNumber();
         System.out.println("Enter Nth Number");
         n=sc.nextInt();
         hn.harmonicNumber(n);
         //System.out.println(hn.n+"th Number Value is "+hn.harmonicNumber(hn.n));
                  
	}

}
