import Task3.A;
class B extends A{
    
    void dataValues()
    {
        System.out.println("B's Values");
    }
}

public class MainClass {
    
    public static void main(String[] args){
        
        B obj = new B();
        obj.dataValues();// it will give an error 
   }
}