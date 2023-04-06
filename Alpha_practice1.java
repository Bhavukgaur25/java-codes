import java.sql.Array;
import java.util.Scanner;

public class Alpha_practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // QUE-1
//        int a = sc.nextInt();
//        int c = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println((a+b+c)/3);

//         QUE-2
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c= a*b;
//        System.out.println("area is equal to - " + c);

        // QUE -3
//        System.out.println("INPUT THE NUMBER");
//        //int no = sc.nextInt();
//        float temp = 103.5F;
//        if(temp>1000){
//            System.out.println("you have a fever");
//        }
//        else {
//            System.out.println("you dont have a fever");
//        }

        // QUE 4
//        int no = 1;
//        while (no != 0)
//        {
//            no = sc.nextInt();
//            switch (no)
//            {
//                case 1:
//                    System.out.println("MONDAY");
//                    break;
//                case 2:
//                    System.out.println("TUESDAY");
//                    break;                case 3:
//                    System.out.println("WEDNESDAY");
//                case 5:
//                    System.out.println("FRIDAY");
//                    break;
//                case 6:
//                    System.out.println("SATURDAY");
//                    break;
//                case 4:
//                    System.out.println("THURSDAY");
//                    break;
//                case 7:
//                    System.out.println("SUNDAY");
//                    break;
//            }
//
//        }
        // QUE- 5
//        int no=1;
//        int odd=0,even=0;
//        while(no!=0)
//        {
//            no = sc.nextInt();
//            if (no % 2 == 0)
//            {
//                even += no;
//            } else
//            {
//                odd += no;
//            }
//        }
//        System.out.println("SUM OF EVEN NOS IS "+even);
//        System.out.println("SUM OF ODD NUMBERS IS "+ odd);


        //  QUE 6
//        // factorial of number
//        for (int i = 2; i <= 4 ; i++) {
//
//            System.out.println(i);
//        };

//        // que 5 (square pattern)
//        for (int i = 0; i < 4; i++) {
//            System.out.println("****");
//        }

        //QUE - 6 (REVERSE OF A NUMBER)
//        int n = 21345;
//        // OUTPUT = 54321
//        int result =0;
//        while(n>0)
//        {
//        int mod = n%10;
//            result*=10;
//        result+=mod;
//
//         n= n/10;
//        }
//        System.out.println(result);

        // factorial of a number
//        int no = sc.nextInt();
//        //4
//        fact(no);
        int  input = sc.nextInt();
       float result = binomialcoeff(4,3);
        System.out.println(result);
    }
    public static int fact(int no)
    {
        int temp=1;
        for (int i = 1; i <= no; i++) {
            temp*=i;
        }
        System.out.println(temp);
        return no;
    }
    public static float binomialcoeff(int n , int r)
    {
        int factN = fact(n);
        int factR = fact(r);
        int diff = fact(n-r);
       float result = factN/(factR)*(diff);
       return diff;
//        System.out.println("BINOMIAL COEFFICIENT IS-",result);
    }

}
