 //Output is explained below the code
 class Test 
 { 
 	 String str = "a";
  		void A() {
   			 try {
   	    		str +="b";
        		B(); }

   				catch (Exception e) { 
   					str += "c";
   								 }
   			 	}


    void B() throws Exception { 
    		try {
    			 str += "d";
    			  C();
     			}
     		 catch(Exception e) { 
     		 	throw new Exception();
     		 				 } 
     			finally { 
     				str += "e"; 
     					} 
    			 str += "f"; 
    						} 
     void C() throws Exception { 
     		throw new Exception(); 
    						 }

     void display() {	
      		System.out.println(str);
      		 }

   		  public static void main(String[] args) 
     { 
    		 	Test object = new Test(); 
  	   			object.A(); object.display(); 
 } }
 /* OUTPUT: str=a firstly A() method will execute then str become ab
 and in method A() there is B() method and then str is now ab and then in method 
 B() str become abd and in method B() there is finally so its adds e in str
 str is now abde
 and then there is C() method in B() method ,C()
 method throws an exception so the compiler checks for catch in C(),B() and A()
 methods and in A() it finds exception obj which add c in str
 and Now the output is simply abdec.*/