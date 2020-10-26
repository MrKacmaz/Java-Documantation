package ObjectOrianted.AbstractClassEx;

public abstract class CAR {
    private int kg;
    private String model;
    private String color;
    private double topSpeed;
    private double HP;
    private double engine;

    //abstract kullanırken kesinlikle 1 tane içi boş method olmalı
    //abstract classdan extend edilen classlarda bu method override edilmeli
    public abstract double oilPerKM();

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }
}
