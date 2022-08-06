/*Program to input age from user and throw user-defined exception if entered age 
is negative In this program, we have created an exception class AgeException which 
extends the built-in Exception class. In main method, we read the input from user
 using Scanner after that we check the age in try block. If it is less than 18 
 then it will throw an exception other it will display message "Valid age". */
package com.lab;
import java.util.Scanner;
public class Age 
{
   public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
    int age;
    System.out.println("Enter your age:");  
    age=sc.nextInt();
     if(age<18)
         {
    	    throw new AgeException("Your age is less than 18"); /* this line will 
    	    throw an AgeException */   
         }
     else
         {
    	    System.out.println("valid age"); 
         }
	}

}
