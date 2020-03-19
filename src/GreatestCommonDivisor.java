import java.util.Scanner;

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a:");
        a=sc.nextInt();
        System.out.print("Enter b:");
        b=sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if (a==0 || b==0)
        {
            System.out.print("No greatest common divisor");
        }

        while (a!=b)
        {
            if (a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }

        System.out.print("Greatest common divisor: "+a);
    }
}
