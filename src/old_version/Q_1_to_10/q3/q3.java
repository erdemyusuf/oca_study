package old_version.Q_1_to_10.q3;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
   /*
    Which option represents the state of the num array after successful completion of the outer loop?
     */
        int num[][]=new int[1][3];
        System.out.println(Arrays.deepToString(num));
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=10;
            }
            System.out.println(Arrays.deepToString(num));

            System.out.println(num.length);
            System.out.println(num[0][0]);
            System.out.println(num[0][1]);
            System.out.println(num[0][2]);
        }
    }




    /*
    Which option represents the state of the num array after successful completion of the outer loop?
     */
}
