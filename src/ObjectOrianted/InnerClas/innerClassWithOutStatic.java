package ObjectOrianted.InnerClas;

public class innerClassWithOutStatic {
    public static void main(String[] args) {

        innerClassWithOutStatic.InnerClassEx innerClassEx = new innerClassWithOutStatic().new InnerClassEx();
        String[] ss = {"alperen", "betül", "kaçmaz"};
        innerClassEx.writeArray(ss);


    }

    public class InnerClassEx {
        public void writeArray(String[] array) {
            for (String s : array) {
                System.out.println(s);
            }
        }
    }
}
