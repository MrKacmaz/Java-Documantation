package ObjectOrianted.AbstractClassEx;

public class NISSAN extends CAR{

    @Override
    public double oilPerKM() {
        return getEngine()*1000/600;
    }
}
