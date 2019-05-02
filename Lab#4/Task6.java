class Task6{
	public static void main(String[ ] args){
	int num=Integer.parseInt(args[0]);
	int [] arr={1,2,3,4,5,6,7,8,9};
	for(int i=0;i<arr.length;i++){
	if(num==arr[i])
	System.out.println("Value found at index ["+i+"]:");
    if(num!=arr[i])
    System.out.println("The value is not found");
}
	}

}