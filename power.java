package sample;

import java.util.Scanner;

public class power {
	 public static int pow(int A,int B,int C) {
	    	int result=1;
	    	for(int i=1;i<=B;i++) {
	    		A=A%C;
	    		{
	    			result=(result*A)%C;
	    		}
	    		
	    	}
			return result;
	    	 
	     }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    int A=sc.nextInt();
	    int B=sc.nextInt();
	    int C=sc.nextInt();
	    System.out.println(pow(A,B,C));
	    
	    
		}

	}


