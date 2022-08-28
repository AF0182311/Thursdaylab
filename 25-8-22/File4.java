 /*Write a program to accept name from the user accordingly create the file, the no of
 file creation will bw depend upon thw user.Accept the data from the user and store 
 the data from the file which is selected by the user, and also perform the delete 
 operation using file. */
package com.rajneesh;
import java.io.*;
import java.util.Scanner;
public class File4 {
	    
	public static void main(String[] args) throws IOException 
		{
			File4 obj=new File4();
			obj.create();
		}
	   public void create() throws IOException
	   {
		   Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name:");
			String s1=sc.nextLine();
		    System.out.println("Hey "+s1+" you have to create multiple file in "
		   + "this program so just press the number how many file you want to create:");
		    int a=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Please enter a file name:");
		    	for(int i=0;i<a;i++)
		    	{
		    		String s=sc.nextLine();
		    	File fi=new File(s);
		    	fi.createNewFile();
		    	}
			System.out.println("Hey "+s1+" your "+a+" file created successfully now"
						+ " you can write data to file");
		
			System.out.println("Hey "+s1+" please enter some text data");
			String s3=sc.nextLine();
			System.out.println("Hey "+s1+" please enter a file name in which you want to write data");
			String s4=sc.nextLine();
			FileWriter fw=new FileWriter(s4);
			fw.write(s3);
			fw.close();
			System.out.println("Hey "+s1+" please enter a file name which you want to delete");
			String s5=sc.nextLine();
			File f6=new File(s5);
			
			if(f6.delete())
			{
				System.out.println("Your file deleted sucessfully");
			}
			else
			{
				System.out.println("File haven't deleted yet");
			}
			System.out.println("Hey "+s1+" you have successfully completed your program");
			System.out.println("Bye Bye!!");
		    }
	   }
