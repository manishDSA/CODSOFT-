package Javaproject;

import java.util.Scanner;

public class randomNumber {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	 int randomNumber = (int)(Math.random()*100);
	 
	 int userNumber=0;
	  do {
		  System.out.println("Guess the Number(1-100): ");
		  
		   userNumber= sc.nextInt();
		   
		  if(userNumber==randomNumber)
		  {
			  
			System.out.println("You win your Number is correct!!");
			 break;
			 
		  }
	  else if(userNumber> randomNumber) {
		  
		System.out.println(" Your Number is too large: ");  
	  }
	  else if(userNumber<randomNumber) 
	  {
		  System.out.println(" your Number is too small: ");
	  }
		  
}while(userNumber>0);
	  
	  
	  System.out.println("My Number was: ");
	  System.out.println(userNumber);
}
}
