class Number
{
       static int add(int a, int b)
    {
       return a+b;
}
     static double add(double a, double b)
    {
      return a+b;
    }
}
    class TestOverloading2
{
public static void main(String[] args)
{
        System.out.println(Number.add(100,1000));
        System.out.println(Number.add(12.4,10.8));
    }
}
             