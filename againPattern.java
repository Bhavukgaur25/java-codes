import java.util.Scanner;

public class againPattern {
    public static void main(String[] args) {
        // we need to print stars as per the given input
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number-");
        no = sc.nextInt();
        for (int i = no; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
