class Test
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
         String n1,n2,n3;
         char f1,f2;
         System.out.println("enter your first name:");
         n1=sc.next();
         System.out.println("enter your middle name:");
         n2=sc.next();
         System.out.println("enter your surname:");
         n3=sc.next();
         f1=n1.charAt(0);
         f2=n2.charAt(0);
         System.out.println(f1+"."+f2+"."+n3);
	}

}