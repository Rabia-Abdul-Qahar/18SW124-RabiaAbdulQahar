class Marksheet{
	    double IS;
            double PE;
            double OOP;

            void Tmarks(double IS,double PE,double OOP){
           			this.IS=IS;
            			this.PE=PE;
            			this.OOP=OOP;
            			double totalmarks=IS+PE+OOP;
           		System.out.println("Total marks: "+totalmarks);
           		 
                                                      }

             void Percent(){
                     double per=(IS+PE+OOP)*100/300;
                     System.out.println("Percentage: "+per);
                 }

               void Grade(){
                        double p=IS+PE+OOP/3;
			if(p>=90)
			  {System.out.println("Grade:A");}
				else 
			if(p<90 && p>=80)
     			  {System.out.println("Grade:B");}
				else
	 		if(p<80 && p>=70)
	 		  {System.out.println("Grade:C");}
			        else
			if(p<=69 && p>=60)
			  {System.out.println("Grade:D");}
                                 else 
    			if(p<60)
     			  {System.out.println("Grade:FAIL");}
                 			
                          }

             }

class Task5{
	   	public static void main(String[] args){
                 Marksheet obj= new Marksheet();

                 obj.Tmarks(90.5,84.7,89.67);
                 obj.Percent();
                 obj.Grade();
	   		}
	   	}