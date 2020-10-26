package ipucumsu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//aynı sayılar var mı yok mu kontrol eder
public class aynıSayımı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int isD = 0;
        Set<Float> foundNumbers = new HashSet<>();
        System.out.print("what is the length of float array: ");
        int rep = input.nextInt();
        float[] floatNumbers = new float[rep];
        for (int i = 0; i < rep; i++) {
            System.out.print("\n" + (i + 1) + " number is = ");
            float numbers = input.nextFloat();
            floatNumbers[i] = numbers;
        }

        for (float num : floatNumbers) {
            if (foundNumbers.contains(num)) {
                isD = -1;
            }
            foundNumbers.add(num);
        }

        System.out.print(Arrays.toString(floatNumbers));
        if (isD == -1) {
            System.err.println("=>NOT DISTINCT" + "\n");
        } else {
            System.out.println("=>DISTINCT" + "\n");
        }
    }
}

