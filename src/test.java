// TODO: 16.10.2020  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class test {

    public static void main(String[] args) {

        System.out.println("\n*****count number of vowel*****");
        counter_vowel();


        System.out.println("\n\n*****is distinct*****");
        distinct();


        System.out.println("\n\n*****shuffle array*****");
        shuffleArray();


    }

    private static void counter_vowel() {
        Scanner input = new Scanner(System.in);
        System.out.print("write a paragraph: ");
        String paragraph = input.nextLine();
        int vowel = 0;
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel = vowel + 1;
            }
        }
        System.out.println("Number of vowel characters = " + vowel + "\n");

    }

    private static void distinct() {
        Scanner input = new Scanner(System.in);
        int isD = 0;
        Set<Float> foundNumbers = new HashSet<>();
        System.out.print("what is the length of float array: ");
        int rep = input.nextInt();
        float[] floatNumbers = new float[rep];
        for (int i = 0; i < rep ; i++) {
            System.out.print("\n"+(i+1) +  " number is = ");
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
        }
        else {
            System.out.println("=>DISTINCT" + "\n");
        }
    }

    private static void shuffleArray() {
        List<Integer> arrayList = new ArrayList<>();
        int[] arr = new int[53];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            arrayList.add(arr[i]);
        }
        Collections.shuffle(arrayList);
        System.out.println(arrayList.toString());

    }

}
