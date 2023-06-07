interface Demo {
   public void fun();
   public void fun1();
   }  
   public class Test1 implements Demo
  {
      public void fun()
  {
       System.out.println("Hello");
  } 
     public void fun1()
   {
      System.out.println("Hi");
   }
public static void main(String[] args)
   {
   Test1 obj = new Test1();
 obj.fun();
 obj.fun1();
   }
}
