class Area {
	
	double Calculate(double a){
		double area=a*a;
		return area;
	}

	double Calculate(double length,double width){
		double area=length*width;
		return area;
	}
}
class Task4{
		public static void main(String[] args){

			Area obj1=new Area();
			Area obj2=new Area();

			System.out.println("Area of Square is: "+obj1.Calculate(4.4));
			System.out.println("Area of Rectangle is: "+obj2.Calculate(4.4,3.0));
		}
}