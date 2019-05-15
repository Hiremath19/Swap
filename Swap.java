import java.util.Scanner;

public class Swap
{
    public static void main(String args[])
    {

        int num1=25;
        int num2=50;

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Swap two numbers are num1 & num2:"+num1 +num2);
    }
}
