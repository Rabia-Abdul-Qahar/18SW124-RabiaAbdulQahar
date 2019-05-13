class Student{
		String name;
		int age;
 	        double percent;

            Student(String name,int age,double percent){
        	         this.name=name;
       	                 this.age=age;
 	                 this.percent=percent;
        	}	

       	    void SetName(String n){
        	this.name=n;
        				}
            
            String getName(){
            	return name; 
            }

            void setAge(int a){
            	this.age=a;
            }

            int getAge(){
            	return age;
            }

            void setPercent(double per){
            	this.percent=per;
            }

            double getPercent(){
            	return percent;
            }
}

class Task4{
		public static void main(String[] args){
            
             Student obj=new Student("Rabia",19,95.5);
               
	     obj.setPercent(99.5);
             String a=obj.getName();
             System.out.println(a);
            
             int b=obj.getAge();
             System.out.println(b);
            
             double c=obj.getPercent();
             System.out.println(c);
				}

			}				