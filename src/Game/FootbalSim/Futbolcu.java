package Game.FootbalSim;

public abstract class Futbolcu {
    private int yas;
    private double boy;
    private double guc;
    private String isim;

    public Futbolcu(int yas, double boy, String isim) {
        this.yas = yas;
        this.boy = boy;
        this.isim = isim;
        guc = (int)((this.boy/this.yas)*10);
        if (guc>100) {
            this.guc = 200 - guc;
        }
    }

    public double getGuc() {
        return guc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
