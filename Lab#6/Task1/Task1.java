class Author{
       
       		private String name;
       		private String email;
       		private char gender;

       public Author(String name,String email,char gender){
	    	   this.name=name;
    		   this.email=email;
    		   this.gender=gender;
       }	

       public String getName(){
    	   return name;
       }

       public String getEmail(){
    	   return email;  
       }

       public void setEmail(String email){
		       this.email=email;
       }

       public char getGender(){
   			return gender;
       }

       public void tostring(){
       System.out.println("Author [name= "+name+",email= "+email+",gender= "+gender+"]:");
       }
}

class Task1{
		public static void main(String[] args){

			Author obj=new Author("Robert Lafore","robertlafore123@gmail.com",'m');
				obj.setEmail("Herberit12345@outlook.com");
				obj.tostring();
		}
}