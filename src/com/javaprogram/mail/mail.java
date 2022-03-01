package com.javaprogram.mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mail {



	public static boolean isValidEmail(String email) 
	{
		   String regex = "^(.+)@(.+)$";
		 // STEP 1: initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	 public static void main(String[] args)
	 {
	       List<String> emails = new ArrayList<String>();
	       emails.add("sai@gmail.com");
	       emails.add("kittu@gmail.com");
	       emails.add("Mittu.me.org");	      
	       emails.add("Sri.@devi.com");
	       emails.add("sarabha.manda.window");
	       emails.add("divyass.kareddy.yahoo");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       sc.close();
	   }
}