/* Write a program to accept basic details name , Phone No , Address ,
user Id and password from the user . 
throw an exception if the user Id lenght is greater than 8 
and password is not matched and should only contain the string value.
Password rules:
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits. */
package com.lab;
public class NotMatched extends RuntimeException{

	NotMatched(String s)
	{
		super(s);  // This line will call RuntimeException class constructor
	}
}
