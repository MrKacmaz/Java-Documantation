package ObjectOrianted.nesne_polymorfhism_olsaVEolmasa;

public class daire extends GeoSekiller{

    private final double pi = 3;
    private  double yarıçap;

    public daire(double yarıçap){
        setYarıçap(yarıçap);
    }

    public double getPi() {
        return pi;
    }

    public double getYarıçap() {
        return yarıçap;
    }

    public void setYarıçap(double yarıçap) {

        if (yarıçap>0){
            this.yarıçap = yarıçap;
        }
        else this.yarıçap = 1;
    }

    @Override
    public double alanHesapla() {
        return pi*yarıçap*yarıçap;
    }

    @Override
    public double çevreHesapla() {
        return 2*pi*yarıçap;
    }
}
