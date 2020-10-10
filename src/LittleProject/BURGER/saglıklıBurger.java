package LittleProject.BURGER;

public class saglıklıBurger extends Burger{

    public saglıklıBurger(){
        super("vegan","kepekli","vegan köfte",24.99);

    }

    @Override
    public double hamburgerBilgileri() {
        System.out.println("ismi = " + getIsmi() +
                "\nEkmak çeşidi = " + getEkmekÇeşidi() +
                "\nEt çeşidi =  " + getEtçeşidi() +
                "\nHamburger fiyatı = " + getFiyat() + "\n");

        return super.getFiyat() ;
    }
}
