class A{
	public void callMethod(){
		System.out.println("A's Method");
	}
}
class B extends A{
	public void callMethod(){
		System.out.println("A's Method");
	}
}
class MainClass{
	 public static void main(String[] args) {
	 	 
	 	 A a= new A();
	 	 B b= new B();
	 	 A r;
	 	 r=a;
	 	 r.callMethod();
	 	 
	 }
}
