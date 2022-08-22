package com.practice;
import java.util.Scanner;
public class Com {
	Scanner sc = new Scanner(System.in);
	 // To check pallindrome string
		String rev1="";                 // String declaration
		public void checkPallindrome()							
		{
			System.out.print("Enter a String : ");
			String st = sc.nextLine();         // accept the string from user
			st = st.toLowerCase();
			for(int i=st.length()-1;i>=0;i--)
			{
				rev1=rev1+st.charAt(i);
			}
			if(st.equals(rev1))						
			{
				System.out.println("It is Palindrome String");
			}
			else
				System.out.println("It is not a Palindrome String ");
		}
		
		// For reverse string
		String rev2="";                 // String declaration
		public void reverse()							
		{
			System.out.print("Enter a String : ");
			String st = sc.nextLine();         // accept the string from user
			st = st.toLowerCase();
			for(int i=st.length()-1;i>=0;i--)
			{
				rev2=rev2+st.charAt(i);
			}
			System.out.println("Reverse of "+st+" is:"+rev2);
		}
		// Permutation of String
		public static void demo(String s1,String s2)    	// demo method that contains recursion process
		{
			if(s1.length() == 0)				// if string length is zero than print that statement
    			{
        			System.out.println(s2);
    			}
    			for(int i=0 ; i<s1.length() ; i++)		
    			{
				char ch = s1.charAt(i);			
				String ls = s1.substring(0,i);		
				String rs = s1.substring(i+1);
				String rest = ls + rs;			// concat a string into a another string
				demo(rest , s2+ch);			
			  }
		}
		public void accept()
		{
			System.out.print("Enter a String : ");		// taking a string from user
			String st = sc.nextLine();
			String st2= "";
			demo(st,st2);	
		}
	public static void main(String[] args) {
		
     Com obj=new Com();
     obj.checkPallindrome();
     obj.reverse();
     obj.accept();
	}

}
