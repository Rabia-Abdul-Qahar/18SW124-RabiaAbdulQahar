class Task5{
public static void main(String[] args){
int [] A={1,120,3,6,7,89,150,10,99,100,12};
int max=0;
int i;
int index=0;
for( i=0;i<A.length;i++){
if(max<A[i]){
max=A[i];
index=i;}}
System.out.println("Max No: "+max+" at index no: [" +index+"]:" );
}}