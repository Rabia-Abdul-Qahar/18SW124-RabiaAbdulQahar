class Shape{
	
		protected String color="red";
		protected boolean filled=true;

			public Shape(){
				this.color="red";
				this.filled=true;
			}

			public Shape(String color,boolean filled){
				this.color=color;
				this.filled=filled;
			}
		
			public String getColor(){
				return color;
			}

			public void setColor(String color){
				this.color=color;
			}

			public boolean isFilled(){
				return filled;
			}

			public void setFilled(boolean filled){
				this.filled=filled;
			}

			public String toString(){
				return "[Color= "+color+",filled= "+filled+"]:";
			}
}

class Circle extends Shape{

		private double radius=1.0;

			public Circle(){
				this.radius=1.0;
			}

			public Circle(double radius,String color, boolean filled){
				super(color,filled);
				this.radius=radius;
			}

			public double getRadius(){
				return radius;
			}

			public void setRadius(double radius){
				this.radius=radius;
			}

			public double getArea(){
				double area=radius*radius*2;
				return area;
			}

			public double getPerimeter(){
				double perimeter=radius/2;
				return perimeter;
			}

			public String toString(){
				return "[radius= "+radius+"[color= "+color+",filled= "+filled+"]]:";
			}

		}
		
class Rectangle extends Shape{

		protected double width=1.0;
		protected double length=1.0;

			public Rectangle(){
				this.width=1.0;
				this.length=1.0;
			}

			public Rectangle(double width,double length){
				this.width=width;
				this.length=length;
			}

			public Rectangle(double width,double length,String color,boolean filled){
				super(color,filled);
				this.width=width;
				this.length=length;
			}

			public double getWidth(){
				return width;
			}

			public void setWidth(double width){
				this.width=width;
			}

			public double getLength(){
				return length;
			}

			public void setLength(double length){
				this.length=length;
			}

			public double getArea(){
				double area=2*length*width;
				return area;
			}

			public double getPerimeter(){
				double perimeter=length*width/4;
				return perimeter;
			}

			public String toString(){
				return "[length= "+length+",width= "+width+" [color= "+color+",filled= "+filled+"]]:";
			}
		}

class Square extends Rectangle{

		private double side;
		
			public Square(){
				side=3.1;
			}

			public Square(double side){
				this.side=side;
			}

			public Square(double side,String color,boolean filled){
			//	super(color,filled);
				this.side=side;
			}

			public double getSide(){
				return side;
			}

			public void setSide(double side){
				this.side=side;
			}

			public void setWidth(double width){
				this.width=width;
			}

			public void setLength(double length){
				this.length=length;
			}

			public String toString(){
				return "[side= "+side+" [length= "+length+",width= "+width+"]]:";
			}
	
		}

class Task3{

	public static void main(String[] args) {
		
		Shape s=new Shape("Blue",true);
	}
}