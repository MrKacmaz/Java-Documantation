package nesne2;

public class Daire {

    private static double yarıçap;
    private static final double pi = 3.14;
    public static int nesneSayısı = 1;



    public void setYarıçap(double yarıçap) {
        if (yarıçap > 0 && yarıçap < Double.MAX_VALUE) {
            this.yarıçap = yarıçap;
        } else {
            System.err.println("\nWRONG !!!");
        }
    }

    public static double getYarıçap() {
        return yarıçap;
    }

    public Daire() {

        System.out.println("\nNesne sayısı: " + nesneSayısı + "\n");
    }

    public static double alanH() {
        return yarıçap * yarıçap * pi;
    }

    public static double çevreH() {
        return 2 * pi * yarıçap;
    }

}
