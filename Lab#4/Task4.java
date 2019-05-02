class Task4{
public static void main(String[] args){
int Row=2 ,Col=2;
int [][] A={{1,2},{3,4}};
int [][] B={{1,2},{3,4}};
int [][] C=new int [Row][Col];
for(int i=0;i<Row;i++){
for(int j=0;j<Col;j++){
C[i][j]=A[i][j]+B[i][j];
System.out.println("SUM of A & B matrix is : ["+i+"]["+j+"]: "+C[i][j]);}}
}}