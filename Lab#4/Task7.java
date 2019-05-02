class BubbleSort{
	void BubbleSort(int arr[]){
	int n=arr.length;
	for(int i=0;i<n-1;i++){
	for(int j=0;j<n-i-1;j++){
	if(arr[j]>arr[j+1]){
	int temp =arr[i];
	arr[i]=arr[j+1];
	arr[j+1]=temp;
	}
	}
	}
	}

void PrintArray(int arr[]){
	int n=arr.length;
	for(int i=0;i<n;i++){
	System.out.println(arr[i]+"  ");
	}
}}
class Task7{
	public static void main(String[] args){
	BubbleSort obj =new BubbleSort();
	int [] arr={64,34,25,12,22,11,90};
	obj.BubbleSort(arr);
	System.out.println("Sorted Array ");
	obj.PrintArray(arr);
}
}	