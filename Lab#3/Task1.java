import java.util.Scanner;
class Task1{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter your marks in three subjects: \n");
	System.out.println(" C++: ");
	int a=sc.nextInt();
	System.out.println(" Data Structures: ");
	int b=sc.nextInt();
	System.out.println(" Operating Systems: ");
	int c=sc.nextInt();
	int Tmarks=a+b+c;
	float per=Tmarks/3f;
	
	if(per>=90)
	{System.out.println("Grade:A");}
	else 
		if(per<90 && per>=80)
      {	System.out.println("Grade:B");}
	else
	 if(per<80 && per>=70){
	System.out.println("Grade:C");}
	else
	 if(per<=69 && per>=60){
	System.out.println("Grade:D");}
     else 
     	if(per<60){
	System.out.println("Grade:FAIL");}

	}
}