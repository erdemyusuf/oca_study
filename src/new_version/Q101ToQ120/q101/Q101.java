package new_version.Q101ToQ120.q101;

import java.util.Arrays;

public class Q101 {
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;

        numbers=new int[4];
        numbers[2]=30;
        numbers[3]=40;
        for(int x:numbers){
            System.out.print(" "+x);
        }
        System.out.println();

        int[] arr=new int[3];
        int arr1[]={1,2,3,4};
        int arr2[]=new int[5];
        arr=arr2;
        arr=arr1;
        arr1=arr2;
        arr2=arr1;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

/*
* What is the result?
A. 10 20 30 40
B. 0 0 30 40
C. Compilation fails.
D. An exception is thrown at runtime.
Answer: B
* */