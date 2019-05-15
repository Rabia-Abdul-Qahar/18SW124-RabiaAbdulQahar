class Person{
		Person(){
			System.out.println("Person's Constructor");
		}
	}

class Employee extends Person{
		Employee(){
			System.out.println("Employee's Constructor");
		}
}

class Faculty extends Employee{
		Faculty(){
			System.out.println("Faculty's Constructor");
		}
}

class Staff extends Employee{
		Staff(){
			System.out.println("Staff's Constructor");
		}
}

class Student extends Person{
		Student(){
			System.out.println("Student's Constructor");
		}
}

class Undergraduate{
		Undergraduate(){
			System.out.println("Undergraduate's Constructor");
		}
}

class Graduate extends Student{
		Graduate(){
			System.out.println("Graduate's Constructor");
		}
}

class Masters extends Graduate{
		Masters(){
			System.out.println("Masters's Constructor");
		}
}

class Doctoral extends Graduate{
		Doctoral(){
			System.out.println("Doctoral's Constructor");
		}
}

class Nondegree extends Graduate{
		Nondegree(){
			System.out.println("Nondegree's Constructor");
		}
}

class Inheritance{
		public static void main(String[] args){
			Nondegree ob=new Nondegree();
			Staff ob1=new Staff();
		}
}