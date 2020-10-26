package ObjectOrianted.AbstractClassEx;

public class NISSAN extends CAR{

    private int oilUse;

    public int getOilUse() {
        return oilUse;
    }

    public void setOilUse(int oilUse) {
        this.oilUse = oilUse;
    }

    @Override
    public double oilPerKM() {
        return getEngine()*1000/600;
    }
}
