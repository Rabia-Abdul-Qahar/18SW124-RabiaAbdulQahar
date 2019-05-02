import java.util.Scanner;
class Task2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter table no: ");
int a=sc.nextInt();
System.out.print("Enter starting point: ");
int b=sc.nextInt();
System.out.print("Enter ending point: ");
int c=sc.nextInt();
int ans=0;
for(int i=b;i<=c;i++){
ans=a*i;
System.out.println(a+"*"+i+"="+ ans);}
}}