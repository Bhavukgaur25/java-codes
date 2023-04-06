import java.util.Arrays;

public class insertionsorting {
    public static void main(String[] args) {
        int temp ;
        int[] arr={2,5,1,6,34};
        for (int i = 0; i <5 ; i++){
            for (int j = i+1; j <5 ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
