package ObjectOrianted.Generic.File;

public class MAIN {
    public static void main(String[] args) {
        String[] sarr = {"alperen", "betül" , "asya"};
        Integer[] iarr = {5,9,7,6,3};
        Double[]darr = {1.2,8.6,9.3,12.958};
        Character[] carr = {'a','b','c'};
        StringArray sa = new StringArray();
        sa.writeStringArray(sarr);

        IntArray ia = new IntArray();
        ia.writeIntArray(iarr);

        CharArray ca = new CharArray();
        ca.writeCharArray(carr);

        DoubleArray da = new DoubleArray();
        da.writeDoubleArray(darr);


        // yaaaaaaaaaaaaaaaa daaaaaaaaaaaaaaaaa

        ArraysWriting<String> s2 = new ArraysWriting<>();
        s2.writeArray(sarr);

        ArraysWriting<Integer> i2 = new ArraysWriting<>();
        i2.writeArray(iarr);

        ArraysWriting<Character> c2 = new ArraysWriting<>();
        c2.writeArray(carr);

        ArraysWriting<Double> d2 = new ArraysWriting<>();
        d2.writeArray(darr);


    }
}
