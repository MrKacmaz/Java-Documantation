package ObjectOrianted.InnerClassAnonimAndyerel;

public class MAIN {
    public static void main(String[] args) {
        String[] names = {"alperen", "betül", "asya"};
        class writeArray {
            public void StringArrays(String[] arr) {
                for (String ss : arr) {
                    System.out.println(ss);
                }
            }
        }
        writeArray w1 = new writeArray();
        w1.StringArrays(names);
        MAIN mm = new MAIN();
        mm.main2();


        //anonymous class created
        life life1 = new life() {
            @Override
            public void wekaUp() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void work() {

            }

            @Override
            public void play() {

            }
        };
    }

    public void main2() {
        int[] aa = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int j : aa) {
            sum += j;
        }
        System.out.println(sum);
    }

    //anonymous class created
    public interface life {
        void wekaUp();

        void eat();

        void work();

        void play();
    }
}
