package ObjectOrianted.InnerClas;

public class innerClassWstatic {
    public static void main(String[] args) {
        String[] ss = {"ASD", "asd", "def", "DEF"};
        Arrays aa = new Arrays();
        aa.writeArray(ss);
        /*Arrays.writeArray(ss);*/
    }

    public static class Arrays {

        public void writeArray(String[] arr) {
            for (String s : arr) {
                System.out.println(s);
            }
        }

    }
}
