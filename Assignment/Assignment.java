class Triangle{
	double hypotenuse;
	double perpendicular;
	double base;
 
	
	public	double getHyp(double base ,double perpendicular){
			this.base=base;
			this.perpendicular=perpendicular;
			this.hypotenuse=Math.sqrt((base*base)+(perpendicular*perpendicular));
			return hypotenuse;
		}
	
	public	double getPerp(double base ,double hypotenuse){
			this.base=base;
			this.hypotenuse=hypotenuse;
			this.perpendicular=Math.sqrt((hypotenuse*hypotenuse)+(base*base));
			return perpendicular;
		}
	
	public	double getBase(double perpendicular,double hypotenuse){
			this.perpendicular=perpendicular;
			this.hypotenuse=hypotenuse;
			this.base=Math.sqrt((hypotenuse*hypotenuse)+(perpendicular*perpendicular));
			return base;
		}
	
	}

class Assignment{
   public static void main(String[] args) {
			Triangle obj=new Triangle();
			System.out.println(obj.getHyp(50,2.5));

		
			}
		}