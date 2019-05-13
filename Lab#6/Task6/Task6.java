class Counter{
	public static int COUNT=0;
	 Counter(){
	 COUNT++;
	 }
}
class Task6{
		public static void main(String[] args){
			Counter c1=new Counter();
			Counter c2=new Counter();
			Counter c3=new Counter();
			System.out.println(Counter.COUNT);
		}
}