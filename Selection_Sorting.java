import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sorting {

    static void SelecSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
           // int start=0;
        int last = arr.length-i-1;
        int MAX = getmax( arr,  0, last);
        swap(arr,MAX,last);
        }
    }
    static void swap(int[] arr,int MAX, int last ){
        int temp;
        temp = arr[last];
        arr[last] = arr[MAX];
        arr[MAX] = temp;
    }

    static int getmax(int[] arr , int start , int end){
        int max =start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
    int[] arr = {4,7,1,5};
    SelecSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
