package ObjectOrianted.nesne_polymorfhism_olsaVEolmasa;

public class dikdörtgen extends GeoSekiller {

    private double en;
    private double boy;

    public dikdörtgen(double en, double boy) {
        setEn(en);
        setBoy(boy);
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        if (en > 0) this.en = en;
        else this.en = 1;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        if (boy > 0) this.boy = boy;
        else this.boy = 1;
    }

    @Override
    public double alanHesapla() {
        return en * boy;
    }

    @Override
    public double çevreHesapla() {
        return (en + boy) * 2;
    }
}
