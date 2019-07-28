class MyCalculator{
	long ans=1;
	public long power(int n,int p)throws Exception{
		if(n<0 || p<0){
		throw new Exception("n or p should not be negative ");
		}
		else if(n==0 && p==0){
		throw new Exception("n or p should not zero ");
		}
		else {
		for(int i=1;i<=p;i++){
		ans*=n;
		}
				}
		return ans;
	}
}

class Task3{
	public static void main(String[] args) {
		MyCalculator obj=new MyCalculator();
		try{
			System.out.println(obj.power(2,-1));
			}
		catch(Exception e){
			System.out.println(e);
		}	

	}
}