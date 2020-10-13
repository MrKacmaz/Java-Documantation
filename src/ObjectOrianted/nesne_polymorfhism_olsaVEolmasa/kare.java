package ObjectOrianted.nesne_polymorfhism_olsaVEolmasa;

public class kare extends GeoSekiller {
    private double kenar;

    public kare(double kenar) {
        setKenar(kenar);
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        if (kenar > 0) {
            this.kenar = kenar;
        } else
            this.kenar = 1;
    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }

    @Override
    public double çevreHesapla() {
        return kenar*4;
    }
}
