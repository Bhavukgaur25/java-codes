import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sorting 
    {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int temp = 0;
        for (int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) 
        {
            for (int j = i+1; j <5 ; j++)
            {
                if(arr[i]>arr[j]) 
                {
                    temp =arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }   
