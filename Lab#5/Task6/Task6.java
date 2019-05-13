class Student{
		String name;
		int age;
        double percent;

        	Student(String name,int age,double percent){
                 this.name=name;
                 this.age=age;
                 this.percent=percent;
        	}	

            public void setName(String n){
        		this.name=n;
        			}
            
            public String getName(){
            	return name; 
            }

            public void setAge(int a){
            	this.age=a;
            }

            public int getAge(){
            	return age;
            }
 
            public void setPercent(double per){
            	this.percent=per;
            }

            public double getPercent(){
            	return percent;
            }
				}

class Marksheet{
			double IS;
            double PE;
            double OOP;

            public void Tmarks(double IS,double PE,double OOP){
           				this.IS=IS;
            			this.PE=PE;
            			this.OOP=OOP;
            			double totalmarks=IS+PE+OOP;
           				System.out.println("Total marks: "+totalmarks);
           		 }

            public void Percent(){
                     	double per=(IS+PE+OOP)*100/300;
                      	System.out.println("Percentage: "+per);
                 }

            public void Grade(){
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


class Result{
	Student s1;
	Marksheet m1;
 		
 			public Result(Student obj1, Marksheet obj2){
 					s1=obj1;
 					m1=obj2;
 								}

 					void createStudentResult(){
                			
                		System.out.println("Student's Biodata: ");
                 			System.out.println(s1.getName());
      				        System.out.println(s1.getAge());
                			System.out.println(s1.getPercent()+"\n");
                	
                		System.out.println("Student's Marksheet: ");
                		    m1.Tmarks(92.4,88.1,90.0);
                	 	    m1.Percent();
                	    	m1.Grade();
 			
 			}
}

class Task6{
		
		public static void main(String [] args){

			Student obj=new Student("Rabia",19,98.8);
			Marksheet obj1=new Marksheet();
            
            Result obj2=new Result(obj,obj1);
			
			obj2.createStudentResult();		
		}
}