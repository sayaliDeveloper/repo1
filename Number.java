package start;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int a;
		  
		  Scanner sc = new Scanner (System.in);
		  
		  
          System.out.println("Enter any number to check even or odd");
          a = sc.nextInt();
   	     
         
          String result = (a%2==0) ? "Even" : "Odd";
         
          System.out.println("The Given Number is :" +result);
          
          
           sc.close();
       
         
	}

}
