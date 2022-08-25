// Write a program to read content from one file and write it into another file 
import java.io.*;
class Hello
{
         public static void main(String[] args) throws IOException
              {
                            FileReader fr=new FileReader("C:\\Users\\Rajneesh\\Desktop\\abc.txt");
	           FileWriter fw=new FileWriter("C:\\Users\\Rajneesh\\Desktop\\abc1.txt");
	            int r1;
		while((r1=fr.read())!=-1)
		{
		   fw.write(r1);	
		}
		fw.close();
		fr.close();
                 } 
}
