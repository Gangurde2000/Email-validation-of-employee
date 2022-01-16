package com.Adarsh.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class FindingString {
	
	public static boolean isValidEmail(String email) {
		
//		here we used the method 
			   String spatialsymbol = "^(.+)@(.+)$";
			 // to check the pattern
		       Pattern pattern = Pattern.compile(spatialsymbol );
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();

		       
		   }

		   public static void main(String[] args) {
			   
			   System.out.println("-----------Email validation of employee----------------\n");
 
		       List<String> emails = new ArrayList<String>();
		       //Examples for checking valid email addresses
		       emails.add("adarshgangurde@gmail.com");
		       emails.add("apgangurde34@gmail.com");
		       emails.add("adarsh87@yahoo.com");
		       //Examples for checking invalid email addresses
		       emails.add("adarsh.gmail.com");
		       emails.add("adars.123aks@gmail.com");
		       emails.add("gangurde@.yahoo.com");

//		       here we are using the insertion sorting 
		       for (String value : emails) {
		           System.out.println("The Email Id " + value + " is " + (isValidEmail(value) ? "a valid email" : "The Email is invalid"));
		       }//printing the entered email is valid or not according to the user
		       
		       System.out.println("\nEnter the Email id to check validation ");
		       Scanner sc = new Scanner(System.in);//takes the email from the user
		       String input = sc.nextLine();
		       System.out.println("The Email Id " + input + " is " + (isValidEmail(input) ? "a valid Email" : "The email is invalid"));//printing the entered email is valid or not according to the user
		       
		   }
		   
}

	
