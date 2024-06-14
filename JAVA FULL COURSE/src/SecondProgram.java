// datatype and variables types
public class SecondProgram
{
    int a=10; //instance variable need object to access it
    static double b=20.35; //static variable don't need class object to access it

    public static void main(String [] args)
    {
        SecondProgram s=new SecondProgram();
      boolean c=true; //local variable can be access directly
        System.out.println("a="+s.a+" "+"b="+b+" "+"c="+c);



    }
}
