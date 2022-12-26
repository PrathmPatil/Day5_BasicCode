package com.basiccode;
import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
      int n;
      int flag1=0;
      int flag2=0;
      
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter Number ");
      n=sc.nextInt();
     for(int i=2;i<n/2;i++){
    	 int rem=n%i;
    	// System.out.println("Rem"+rem);
    	 
    	  if(rem==0)
    	  {
    		  int fac=n/i;
    		 // System.out.println("fac"+fac);
    		  for(int j=2;j<fac/2;j++){
    			  if(fac%j==0)
    			  {
    				  flag1++;
    				  break;
    			  }   		
    		  }
    		  if(flag1==0)
			  {
				  System.out.println(fac);
			  }  
    	  }
    	  if(rem==0) {
    		for(int j=3;j<=n/2;j++) {
    			if(i%j==0) {
    				flag2++;
    				break;
    			}
    		}
    		if(flag2==0 || i==2) {
    			System.out.println(i);
    		}
    	  }
      }
	}

}
