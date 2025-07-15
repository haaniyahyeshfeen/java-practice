package mywork;

import java.util.Scanner;

public class countEvenOdd {
	public static void main(String[]args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number of elements: ");
		int num = scan.nextInt();
		int[] a = new int[num];
		 for(int i=0; i<num; i++) {
			 a[i]=scan.nextInt();
		 }
		 int ce=0;
		 int co=0;
	    for(int i=0;i<num;i++) {
	    	
	    		if(a[i]%2==0) {
	    			ce+=1;
	    	}
	    		else {
	    		co+=1;
	    		}
	    	
	    }
	    System.out.println("Even = "+ce);
		System.out.println("Odd = "+co);
	}
}
