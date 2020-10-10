package nesne;

public class Rectangle {
    public double height;
    public double weight;

    public String area() {
        return "Area is: " + height * weight;

    }

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    //sadece weight in const. var. height verilmiş.
    public Rectangle(double weight) {

        height = 25;

        if (weight > 0 && weight < 50) {
            this.weight = weight;

        } else {
            System.out.println("wrong weight");

        }


    }

}
