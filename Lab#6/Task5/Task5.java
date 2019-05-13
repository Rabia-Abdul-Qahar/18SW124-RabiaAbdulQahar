class Student{
		String name;
		int age;
		String address;

		Student(){
			this.name="unknown";
			this.age=0;
			this.address="not available";
		}	
	
		public void setInfo(String name,int age){
			System.out.println(this.name=name);
			System.out.println(this.age=age);
		}
	
		public void setInfo(String name,int age,String address){
			System.out.println(	this.name=name);
			System.out.println(this.age=age);
			System.out.println(this.address=address+"\n");
		}

}
class Task5{
		public static void main(String[] args){
				Student[] obj=new Student[10];
		 
				obj[0]=new Student();
				obj[0].setInfo("Rabia",19,"house no:9089 Hyderabad");
				
				obj[1]=new Student();
				obj[1].setInfo("Iqra",18,"house no:239 Matiari");
				
				obj[2]=new Student();
				obj[2].setInfo("Neha",19,"house no:89 Hyderabad");
				
				obj[3]=new Student();
				obj[3].setInfo("Dua",17,"house no:400 Dadu");
				
				obj[4]=new Student();
				obj[4].setInfo("Unza",19,"house no:20 Mirpur khass");
				
				obj[5]=new Student();
				obj[5].setInfo("Mahrukh",18,"house no:78 Jamshoro");
				
				obj[6]=new Student();
				obj[6].setInfo("Yusra",19,"house no:34 Qasimabad");
				
				obj[7]=new Student();
				obj[7].setInfo("Dania",19,"house no:239 Quetta");				
			
				obj[8]=new Student();
				obj[8].setInfo("Wajiha",16,"house no:098 Hyderabad");
				
				obj[9]=new Student();
				obj[9].setInfo("Iqra",18,"house no:239 Matiari");	

					}
}