import java.util.*;
	class Task7{
			public static void main(String[] args){
					Scanner sc=new Scanner(System.in);
                  
					      String  str=sc.nextLine();
				          String split[]=str.split(",");
			                            //Student 1 data
				                    System.out.println("Student 1:");
	            			        System.out.println("Name: "+split[0]);
	    	    	    	        System.out.println("Age: "+split[1]);
    	    	    	    	    System.out.println("Program: "+split[2]);
                                        //Student 2 data
              		    			System.out.println("\n\nStudent 2:");
          	           				System.out.println("Name: "+split[3]);
            	    			    System.out.println("Age: "+split[4]);
         					        System.out.println("Program: "+split[5]); 
			}
}