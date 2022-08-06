package com.lab;
import java.util.Scanner;
public class UserDetails 
{
   public static void main(String[] args)
   {
    String name,address,userId,password;
    long phoneNo;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a name of user:");
    name=sc.nextLine();
    System.out.println("Enter a address of user:");
    address=sc.nextLine();
    System.out.println("Enter a User Id:");
    userId=sc.nextLine();
    System.out.println("Enter a password:");
    password=sc.nextLine();
    System.out.println("Enter a phone number of user:");
    phoneNo=sc.nextLong();
    int n = 0,n1=0;
       if(userId.length()>8 && password.length()>=8) //check the length of userid and password 
         {
    	   for(int i=0;i<password.length();i++)
    	   {
    		   if(Character.isDigit(password.charAt(i)))
    		   {
    			n++;
    		   }
    	   }
    	   if(n>=2)
    	   {
    		   String s1="!@#$%k^&*()+-/,.<>?/;:{}[]\\;";
    		for(int i=0;i<password.length();i++)
    		{
    			char ch=password.charAt(i);
    			if(s1.contains(Character.toString(ch)))
    			{
    				n1++;
    			}
    		}
    	   }
    	   else
    	   {
    		   throw new NotMatched("Your userId or password is not satisfied with our requirements");   
    	   }
    		 if(n1==0)
      	       {
      	         System.out.println("Hey "+name+" welcome to the programming world"); 
      	        }
      	      else
    	       {
    		   throw new NotMatched("Your userId or password is not satisfied with our requirements");   
    	       }
    	   }
       else
       {
         throw new NotMatched("Your userId or password is not satisfied with our requirements");
       }
    }
}