class Task4{
	public static void main(String [] args){
     
     int num1=Integer.parseInt(args[0]);
     
     char[] opers= args[1].toCharArray();
     char oper = opers[0];
     
     int num2=Integer.parseInt(args[2]);
     int ans=0;
     System.out.println("1st operand is: "+ num1);
     System.out.println("Operation is: "+ oper);
     System.out.println("2nd operand is: "+ num2);
     switch(oper){
     	case '+': ans=num1+num2;
     	System.out.println(" Sum: "+ans);
     	break;
     	case '-': ans=num1-num2;
     	System.out.println("Sub: "+ ans);
     	break;
     	case '/':  ans=num1/num2;
     	System.out.println("Divison: "+ ans);
     	break;
    	case '*': ans=num1*num2;
     	System.out.println("Multiple: "+ ans);
     	break; 		

     }

	}
	}