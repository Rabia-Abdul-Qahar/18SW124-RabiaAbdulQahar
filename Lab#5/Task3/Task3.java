class Dog{
	String name;
	String breed;
	int age;
		public void SetDetails(String name,String breed,int age){
			this.name=name;
	    		this.breed=breed;
    			this.age=age;
    			}

    	public void ShowDetails(){
    		
   			 if(this.name==null && this.breed==null && this.age==0){
	    			System.out.println(" Details are unavailable. ");}
   			 else
   				{System.out.println(" Dog name: "+name);
    				System.out.println(" Dog breed: "+breed);
    				System.out.println(" Dog age: "+age);}
    		}
    	}


class Task3{
		public static void main(String[] args){
			Dog obj=new Dog();
		
			obj.ShowDetails();
				}
		}
           