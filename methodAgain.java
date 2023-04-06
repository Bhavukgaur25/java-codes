import java.util.Arrays;
import java.util.Scanner;

public class methodAgain
{
    public static void main(String[] args)
    {
        System.out.println("hey enter as character as much you want ");
        fun(2,5,6,3,6,2,4,4,5,2,2);

    }
    static void fun(int...charr)
    {

        System.out.println(Arrays.toString(charr));
    }
}

