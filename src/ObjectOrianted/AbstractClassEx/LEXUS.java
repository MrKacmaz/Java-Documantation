package ObjectOrianted.AbstractClassEx;

public class LEXUS extends CAR {
    NISSAN N = new NISSAN();

    @Override
    public double oilPerKM() {
        return getEngine()*5/3*0.65;
    }
}
