import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
    int[] arr = {4,5,3,2,1};
    cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr){
        int i =0;

        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr , int i , int correctIndex){
     int temp ;
     temp = arr[i];
     arr[i] = arr[correctIndex];
     arr[correctIndex] = temp;
        }
    }

