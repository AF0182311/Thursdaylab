package com.lab;

public class NotMatched extends RuntimeException{

	NotMatched(String s)
	{
		super(s);  // This line will call RuntimeException class constructor
	}
}
