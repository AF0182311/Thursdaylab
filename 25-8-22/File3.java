package com.rajneesh;
	import java.io.*;
	/*Q1)Write a Java Program to Create a new text file and read the input
	 *from the user Name, Phone No, Bank name ,Account No, Type of Account,
	 *,Amount for FD, Duration for FD , Calculate the amount and display the
	 * final amount. Save the input in the
	 *text file and also store the FD information.
	*/
	import java.util.Scanner;

	public class File2 {
		Scanner sc = new Scanner(System.in);
		String name,write;
		String username;
		String BankName;
		String Phoneno;
		String AccountNo,s1;
		int amount,year,rate;
		File obj1;
		FileWriter f1;
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			File2 obj=new File2();
			
			obj.create();
			obj.details();
			obj.calculate();
			obj.read();
			
		}
		public void create() throws IOException 
		  {
			System.out.println("Enter a file name");
			name=sc.nextLine();
			obj1=new File(name);

			if(obj1.createNewFile()) {
				System.out.println("the file has been CREATED");
			}
			else {
				System.out.println("File already exists");
			}
			} 
		public void details() throws Exception{
			System.out.println("Enter a username:");
	    	username=sc.nextLine();
	    	System.out.println("Enter a bank name:");
	    	BankName=sc.next();
	    	System.out.println("Enter your acc no:");
	    	AccountNo = sc.next();
	    	System.out.println("Enter your phone no:");
	    	Phoneno = sc.next();
	    	System.out.println("Enter the type of account:");
	         s1=sc.nextLine();
	         sc.nextLine();
	    	System.out.println("Enter the amount for FD:");
	    	amount=sc.nextInt();
	    	System.out.println("Enter the duration for FD:");
	    	year=sc.nextInt();
	    	System.out.println("Enter the rate if interest:");
	    	rate=sc.nextInt();
	    	f1=new FileWriter(obj1);
	    	f1.write("Username is:"+username);
	    	f1.write("\n");
	    	f1.write("Bank name is:"+BankName);
	    	f1.write("\n");
	    	f1.write("Account number is:"+AccountNo);
	    	f1.write("\n");
	    	f1.write("Phone number is:"+Phoneno);
	    	f1.write("\n");
	    	f1.write("Type of account is:"+s1);
	    	f1.write("\n");
	    	f1.write("Amount is:"+amount);
	    	f1.write("\n");
	    	f1.write("Fd for year:"+year);
	    	f1.write("\n");
	    	f1.write("The interest rate for fd:"+rate);
	    	f1.write("\n");
	    	}
		public void calculate() throws IOException
		{
			float a=((amount*rate*year)/100);
			f1.write("The final amount is"+(a+amount));
			f1.close();
		}
		public void read() throws FileNotFoundException
		{
	      System.out.println("you can read");
	   	 	
	  	    Scanner scan=new Scanner(new File(name)); 
	  	    		while(scan.hasNextLine())
	  	     {
	  	    	 String s=scan.nextLine();
	  	    	 System.out.println(s);
	  	    	 System.out.println();
	  	     }
		}
		
		
		
	}

