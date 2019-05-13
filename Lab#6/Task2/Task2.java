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
class Book{
	
	private String name;
	private Author[] authors;
	private double price;
	private int qty=0;

		public Book(String name,Author[] authors,double price){
				this.name=name;
				this.authors=authors;
				this.price=price;
		}
		public Book(String name,Author[] authors,double price,int qty){
		        this.name=name;
				this.authors=authors;
				this.price=price;
				this.qty=qty;
		}
		public String getName(){
			return name;
		}
		public Author[] getAuthors(){
			return authors;
		}
		public double getPrice(){
            return price;
		}
		public void setPrice(double price){
            this.price=price;
		}
		public int getQty(){
            return qty;
		}
		public void setQty(int qty){
            this.qty=qty;
		}
		public String toString(){
			return "Book [name= "+name+authors+",price= "+price+",qty= "+qty+"]:";
			
		}
		public Author[] getAuthorsNames(){
             return authors;
		}

}
class Task2{
			public static void main(String [] args){
			
			Author obj1=new Author("Charlie caplin","charlieNone@yahoo.com",'m');
            Author obj2=new Author("Einstein","einsteintheory456@gmail.com",'m');
			
			Author[] obj={obj1,obj2};
			
			Book obj3=new Book("Chocolate factory",obj,750.5);
			
			}
}