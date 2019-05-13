import java.util.*;
class Task1{
	public static void main(String[] args)
{   Scanner sc= new Scanner(System.in);
	String h;
    System.out.print("Read a complete line: ");
    h=sc.nextLine();
    System.out.print("Read a byte: ");
    byte a=sc.nextByte();
	System.out.print("Read a short: ");
	short b=sc.nextShort();
	System.out.print("Read a int: ");
	int c=sc.nextInt();
	System.out.print("Read a long: ");
	long d=sc.nextLong();
	System.out.print("Read a float: ");
	float e=sc.nextFloat();
	System.out.print("Read a double: ");
	double f=sc.nextDouble();
	System.out.print("Read a boolean: ");
	boolean g=sc.nextBoolean();
    System.out.print("Read a word: ");
    String i=sc.next();
    System.out.println("\n\n\nUser entered: \n\n"+h+" \n"+a+"\n"+b+"\n"+c+"\n"+d+" \n"+e+"\n"+f+"\n"+g+"\n"+i);
    
}}