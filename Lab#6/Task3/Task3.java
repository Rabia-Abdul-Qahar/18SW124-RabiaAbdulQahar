class Print{
	
	public void Stars(int n,char c){
		for(int i=1;i<=n;i++){
			System.out.println();
				for(int y=1;y<=i;y++){ 
					System.out.print(c);
			}
		}
	}

	public void Stars(char c,int n){
		for(int i=1;i<=n;i++){
			for(int j=5;j>=i;j--){
				System.out.print(c);}
					System.out.println();
        	}
        }

}
class Task3{
		public static void main(String[] arsg){
		
			Print obj=new Print();
			obj.Stars('*',7);
			obj.Stars(7,'*');
		}
}