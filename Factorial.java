import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NUMBER 1-");
        Scanner sc =     new Scanner(System.in);
        int no1 = sc.nextInt();
        System.out.println("ENTER YOUR NUMBER 2-");
        int no2 = sc.nextInt();
        float result = BinCof(no1,no2);
        System.out.println("BINOMIAL COEFFICIENT IS -"+ result);
    }
    public static float BinCof(int no,int x)
    {
        int numerator , denominator;
        float result;
        numerator = fact(no);
        denominator = fact(x)*fact(no-x);
        result = numerator/denominator;
        return result ;
    }
    public static int fact(int a)
    {
        int temp =1;
        for (int i = 1; i <=a ; i++)
        {
        temp = temp *i;
        }
        return temp;
    }
}
