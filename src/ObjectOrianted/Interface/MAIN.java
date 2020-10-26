package ObjectOrianted.Interface;

public class MAIN {
    public static void main(String[] args) {
        // aralarında bağ olmayan sınıfları birleştirmek için kullanılır

        square s1 = new square(15);
        square s2 = new square(9);

        personnel p1 = new personnel(22);
        personnel p2 = new personnel(30);

        compareInMain(s1,s2);
        compareInMain(p1,p2);
    }

    public static void compareInMain(compare o1, compare o2){
        System.out.println(o1.compareTwoObject(o2));
    }

}
