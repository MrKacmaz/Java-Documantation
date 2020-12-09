package ObjectOrianted.AbstractClassEx;

public class MAIN {
    public static void main(String[] args) {

        CAR nissan = new NISSAN();
        nissan.setName("Nissan");
        nissan.setColor("blue");
        nissan.setHP(879.89);
        nissan.setKg(1350);
        nissan.setModel("Skyline");
        nissan.setTopSpeed(325);
        nissan.setEngine(6.1);

        NISSAN nn = new NISSAN();



        CAR lexus = new LEXUS();
        lexus.setName("Lexus");
        lexus.setColor("grey");
        lexus.setHP(855);
        lexus.setKg(970);
        lexus.setModel("LX-R");
        lexus.setTopSpeed(250);
        lexus.setEngine(4.1);


        show(nissan);
        show(lexus);
    }
    public static void show(CAR car){
        System.out.println("name: " + car.getName());
        System.out.println("oil / km: " + (int)car.oilPerKM());
        System.out.println("kg: " + car.getKg());
        System.out.println("HP: " + car.getHP());
        System.out.println("color: " + car.getColor());
        System.out.println("Model: " + car.getModel());
        System.out.println("Top Speed: " + car.getTopSpeed());
        System.out.println("Engine: " + car.getEngine() + "\n");
    }
}
