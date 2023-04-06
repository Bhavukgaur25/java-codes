import java.util.Arrays;

public class methodsKSP {
    public static void main(String[] args)
    {
//        isPrime(15);
//        int[] arr = {1,2,3,4,9,6};
//        int size = 6;
//        isPythagon(arr,size);
//        primeRange(10,20);
//        sumNnatural(4);
        isPerfectno(6);
    }
    // que - is prime or not
    public static void isPrime(int no)
    {
        int temp =0;
        for (int i = 2; i <=(int)Math.sqrt(no) ; i++)
        {
            if(no%i==0)
            {
                System.out.println("NOT PRIME");
                temp++;
                break;
            }

        }
        if(temp==0)
        {
            System.out.println("PRIME IT IS ");
        }
    }
    //que 2 is pythagon triplet or not

    public static void isPythagon(int[] arr , int n)
    {
        int x,y,z;
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n ; j++)
            {
                for (int k = j+1; k <n ; k++)
                {
                  x=arr[i]*arr[i];
                  y=arr[j]*arr[j];
                  z=arr[k]*arr[k];
                    if (x == y + z || y == x + z || z == x + y)
                    {
                        System.out.println("IT HAS PYTHAGON TRIPLET");
                        temp++;
                        break;
                    }
                }

            }
        }
        if(temp==0)
        System.out.println("NO TRIPLETS");
    }

    //que --> ALL PRIME NO BETWEEN RANGE
    public static void primeRange(int a ,int b)
    {
    int temp =0;
        for (int i = a; i <=b ; i++)
        {
            for (int j = 2; j <= (int)Math.sqrt(a); j++)
            {
                if(a%j==0)
                {
                    temp=1;

                }
            }
            if(temp==0)
            {
                System.out.println(a);
            }
            temp = 0;
        }
    }
    // que--> sum of n natural number

    public static void sumNnatural(int no)
    {
    int temp=0;
        for (int i = 1; i <=no; i++)
        {
            temp=temp+i;
        }
        System.out.println("SUM OF N NATURAL NUMBER IS "+temp);

    }

    //que---> is that a perfect number or not

    public static void isPerfectno(int no)
    {
        int temp=0;
        for (int i = 1; i <no ; i++)
        {
            if(no%i==0)
            {
                temp=temp+i;
            }
        }
        if(temp==no)
        {
            System.out.println(no+" ----> PERFECT NUMBER");
        }
        else
        {
            System.out.println("IMPERFECT NUMBER");
        }
    }
}
