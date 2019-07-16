class Circle{

		protected double radius=1.0;
		protected String color="red";

			public Circle(){
				this.radius=1.0;
				this.color="red";
			}

			public Circle(double radius,String color){
				this.radius=radius;
				this.color=color;
			}

			public double getRadius(){
				return radius;
			} 

			public void setRadius(double radius){
				this.radius=radius;
			}

			public String getColor(){
				return color;
			}

			public void setColor(String color){
				this.color=color;
			}

			public double getArea(){
				double area;
				area=radius*radius*2;
				return area;
			}

			public String toString(){
				return "Circle[radius= "+radius+",color= "+color+"]:";
			}	
}

class Cylinder extends Circle{

		private double height=1.0;
			
			public Cylinder(){
				height=1.0;
			}

			public Cylinder(double radius){
				setRadius(radius);
			}

			public Cylinder(double radius,double height){
				setRadius(radius);
				this.height=height;
			}

			public Cylinder(double radius,double height,String color){
				super(radius,color);
				this.height=height;
			}			

			public double getHeight(){
				return height;
			}

			public void setHeight(double height){
				this.height=height;
			}

			public double getVolume(){
				double volume;
				volume=radius*height;
				return volume;
			}

}

class Task1{

		public static void main(String[] args) {
			
			Circle cir=new Circle(2.2,"Blue");
			System.out.println(cir.toString());
			Cylinder cyl= new Cylinder(0.4,5.5,"Green");
			System.out.println(cyl.toString());

		}
}