package com.lab;
public class AgeException extends RuntimeException
{
   AgeException(String s)
   {
	   super(s);  // This line will call RuntimeException class constructor  
   }
}
