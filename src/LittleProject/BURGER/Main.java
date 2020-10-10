package LittleProject.BURGER;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("sade","sade","normal et",19.99);
        burger.ilaveUrünEkle1("Soğan Halkası 10'lu",4.99);
        burger.ilaveUrünEkle2("Tavuk Kızartması" ,5.99);
        burger.ilaveUrünEkle3("BBQ sos",1);
        burger.ilaveUrünEkle4("Ranch sos",1);


        burger.hamburgerBilgileri();

        Burger burger1 = new Burger(null,"susamlı","vegan köfte",27);
        burger1.hamburgerBilgileri();


        babaBurger babaBurger = new babaBurger();
        babaBurger.hamburgerBilgileri();

        saglıklıBurger saglıklıBurger = new saglıklıBurger();
        saglıklıBurger.hamburgerBilgileri();

    }

}
