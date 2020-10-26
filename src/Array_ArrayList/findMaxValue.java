package Array_ArrayList;

import java.util.Arrays;

public class findMaxValue {
    public static void main(String[] args) {
        int [] arr = {59,9,7,84,65,465};
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + " index = " + index);

        double x = Math.random()*10;

        // REVERSE THE ELEMENTS WITHIN AN ARRAY
        int N = arr.length;
        for (int i = 0; i < N/2; i++) {

            int temp = arr[i];
            arr[i] = arr[N -1 -i];
            arr[N -1 -i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }



}
