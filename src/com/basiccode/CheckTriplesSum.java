package com.basiccode;
import java.util.Scanner;

public class CheckTriplesSum {

	 public static void triples(int arr[],int n) {
		 boolean check=true;
		 for(int i=0;i<n-2;i++) {
			 for(int j=i+1;j<n-1;j++) {
				 for(int k=j+1;k<n;k++) {
					 if(arr[i]+arr[j]+arr[k]==0) {
						 System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" are triples.");
					  check=true;
					 }
				 }
			 }
			 if(check==false) {
				 System.out.println("No triples in elements.");
			 }
		 }
	 }
	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter number of elements: ");
      int n=sc.nextInt();
      System.out.println("Enter Elements: ");
      int [] arr=new int [n];
      for(int i=0;i<n;i++) 
      {
    	  arr[i]=sc.nextInt();
      }
      triples(arr,n);
	}

}
