//Conditional statements in java
import java.util.*;
public class ConditionalStatements
{
    public static void main(String [] args)
    {
        //if statement start
        int pwd ,pwd1;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your password hammad");
        pwd=sc.nextInt();
        if(pwd==1301) {
            System.out.println("Name : Hammad sajid");
            System.out.println("Age : 22");
            System.out.println("Contact:0347-5292023");
        }
        System.out.println("is statement ends");
        //if statement ends
        //if-else starts
        System.out.println("please enter your password hamza");
        pwd1=sc.nextInt();
        if(pwd1==1302)
        {
            System.out.println("Name : Hamza sajid");
            System.out.println("Age : 21");
            System.out.println("Contact:0347-5292023");
        }
          else
          {
            System.out.println("wrong password");
         }
          //if else ends
        //else-if starts
        int marks;
        System.out.println("enter your marks ");
        marks=sc.nextInt();
        if(marks>=60 && marks<=100)
        {
            System.out.println("First Division");
        }
        else if(marks>=45 && marks<60)
    {
        System.out.println("Second Division");
    } else if (marks>=33 && marks<45)
    {
        System.out.println("Third Division");
    }
        else
        {
            System.out.println("Failed");
        }
        //else-if ends

    }
}
