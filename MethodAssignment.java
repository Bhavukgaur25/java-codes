public class MethodAssignment {


    public static void main(String[] args) {
        average(20,27,29);
        isEven(54);
        checkPalimdrome(122);
        sumDigits(1234);
    }
    // que 1 average of three numbers
    public static void average(int no1 , int no2 , int no3)
    {
        int result = (no1 + no2 + no3)/3;
        System.out.println("average is "+result);
    }
    // que 2
    public static boolean isEven(int no)
    {
        if(no%2==0)
        {
            return true;
        }else
        return false;
    }

    // que 3 palindrome
    public static void checkPalimdrome(int no)
    {
        int temp = no;
        int tempp =0;
        while (no!=0)
        {
            int lastdigit = no % 10;
            tempp = tempp * 10 + lastdigit;
            no = no / 10;
        }
        if(tempp==temp)
        {
            System.out.println("NO IS PALINDROME");
        }
        else
        {
            System.out.println("NOT PALINDROME");
        }
    }
    public static void sumDigits(int no)
    {
        int temp = no;
        int sum =0;
        while (no!=0)
        {
            int lastdigit = no % 10;
           sum = sum  + lastdigit;
            no = no / 10;
        }
        System.out.println("sum of digits is ->"+sum);
    }
}
