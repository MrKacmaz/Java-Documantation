package ObjectOrianted.InnerClas;

public class whatIsTheStatic {
    public static void main(String[] args) {

        whatIsTheStatic nesne = new whatIsTheStatic();
        nesne.sayHi();

        sayHiWithStatic();

    }
    public void sayHi(){
        System.out.println("Hi, i haven't got a static\n");
    }
    public static void sayHiWithStatic(){
        System.out.println("Hi, i have a static");
    }
}
