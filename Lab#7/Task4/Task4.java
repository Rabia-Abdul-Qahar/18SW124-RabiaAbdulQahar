abstract class Shape{
	
		protected String color;
		protected boolean filled;

			public Shape(){
				System.out.println("Shape's default constructor ");
			}

			public Shape(String color, boolean filled){
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

			abstract public double getArea();
			
			abstract public double getPerimeter();

			public String toString(){
				return "[color= "+color+",filled= "+filled+"]:";
			}
	
		}

class Circle extends Shape{

		protected double radius;

			public Circle(){
				System.out.println("Circle's default constructor");
			}

			public Circle(double radius){
				this.radius=radius;
			}

			public Circle(double radius,String color,boolean filled){
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
				return 2*radius*radius;
			}

			public double getPerimeter(){
				return radius/2;
			}

			public String toString(){
				return "[radius= "+radius+" [color= "+color+",filled= "+filled+"]]:";
			}
		
		}

class Rectangle extends Shape{

		protected double width;
		protected double length;

			public Rectangle(){
				System.out.println("Rectangle's default constructor ");
			}

			public Rectangle(double width,double length){
				this.width=width;
				this.length=length;
			}

			public Rectangle(double width,double length, String color,boolean filled){
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
				return length*width;
			}

			public double getPerimeter(){
				return length*width/2;
			}

			public String toString(){
				return "[length= "+length+" ,width= "+width+" [color= "+color+",filled= "+filled+"]]:"; 
			}

		}