import java.util.*;
class Task2Half{
     Scanner sc= new Scanner(System.in);
       int [] arr=new int[6];
	
	void PopulateArray(){

   		 for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}			
	}//populate array method
	
        void Tocheck(){
		for(int j=0;j<arr.length;j++){
        		if(arr[j]%2==0){
				System.out.println("Number is even at index ["+j+"]:");
				continue;
					}
						}
			System.out.println("\n\n");	
		for(int l=0;l<arr.length;l++){
			if(arr[l]%2!=0){
    				System.out.println("Number is odd at index ["+l+"]:");
				continue;	
				}
					}
						}//tocheck method
	}//end of class array

class Task2{
	public static void main(String [] args){
		Task2Half ob=new Task2Half();
    			ob.PopulateArray();
    			ob.Tocheck();
	}
		}