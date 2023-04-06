import java.security.PublicKey;
import java.util.Scanner;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        hollowring(8,8);
        invertedHalfPyramid(4);
        invertedNoHalfPyramid(4);
        floyidTriangle(4);
        diamond(3);
        solidRohmbus(4);
        //butterfly(4);
    }
    public static void pattern()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR INPUT");
        int input = sc.nextInt();
        // 7
        for (int i = input; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void hollowring(int row, int col)
    {
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= col; j++)
            {
                if(i==1 || i==col || j==1 || j==row)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
    // inverted and rotated half pyramid

    public static void invertedHalfPyramid(int no)
    {
        // input 5
        //spaces or *
        for (int i = 0; i < no; i++) {
            //space
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println(" ");
        }
    }

        // inverted half pyramid

        public static void invertedNoHalfPyramid(int o)
        {
            int temp=o;
            for (int i = 0; i < temp ; i++)
            {
                for (int j = 1; j <=o; j++)
                {
                    System.out.print(j);
                }
                o--;
                System.out.println(" ");

            }
            /*
            ALTERNATIVE APPROACH

            for(int i = 1; i<=o; i++)
            {
                for(int j =1; j<=o-i+1; j++)
                {
                System.out.print(j);
                }
                System.out.println(" ");
            }
             */
        }
        public static void floyidTriangle(int no)
        {
            int temp = 1;
            for (int i = 0; i < no; i++) {
                for (int j = 0; j <=i ; j++) {
                    System.out.print(temp);
                    temp++;
                }
                System.out.println(" ");
            }
        }

        // right now we have diamond structure
     /*   no = 3
                                   spaces        ..outer loop 5 bar
                        *   i=1     2               inner loop kitni bar
                       * *  i=2     1
                      * * *  i=3    0               mai puchunga triangle kitna bda chahiye us hisab se i ll draw
                       * *  i=4
                        * i=5
                        column = 5
                        row= 3
      */

        public static void diamond(int no )
        {
            // for part 1
            for (int i = 1; i <= no; i++) {
                for (int j = 1; j <=no-i ; j++) {
                    System.out.print(" ");

                }
                for (int j = 1; j <=(2*i-1); j++) {

                    System.out.print("*");

                }

                System.out.println(" ");

            }
            for (int i = no; i >0; i--) {
                for (int j = 1; j <=no-i ; j++) {
                    System.out.print(" ");

                }
                for (int j = 1; j <=(2*i-1); j++) {

                    System.out.print("*");

                }

                System.out.println(" ");

            }
        }

        // SOLID ROHMBUS

    public static void solidRohmbus(int no)
    {
        for (int i = 1; i <=no ; i++) {
            //spaces
            for (int j = 1; j <=no-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=no ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void butterfly(int no)
    {
        for (int i = 1; i <=4 ; i++) {
            //star
            //space
            //star
            for (int j = i; j<=4 ; j++) {

                System.out.println("*");
                
            }
            // space
            for (int k = 1; k <= 2*(no-i) ; k++) {
                System.out.println(" ");
            }

            //star
            for (int j = i; j<=4 ; j++) {

                System.out.println("*");

            }

            // 2nd half
            for (int j = 4; j<=1 ; j--) {

                System.out.println("*");

            }
            // space
            for (int k = 4; k <= 2*(no-i) ; k--) {
                System.out.println(" ");
            }

            //star
            for (int j = 4; j<=1 ; j--) {

                System.out.println("*");

            }


        }
    }

}


