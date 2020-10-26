package ObjectOrianted.Generic.GenericAbstractUsage;

public class MAIN {
    public static void main(String[] args) {
        square s1 = new square(9);
        square s2 = new square(7);
        circle c1 = new circle(6);
        circle c2 = new circle(7);
        square newS = compareArea(s1, s2);
        circle newC = compareArea(c1, c2);
        square newS2 = compareCircumference(s1, s2);
        circle newC2 = compareCircumference(c1, c2);
        System.out.print(newS.area() + " " + newS2.circumference() + "\n");
        System.out.print(newC.area() + " " + newC2.circumference());
    }

    //<General extends Shapes denmesinin sebebi Shapes abstrck classının içindeki verilere ulaşabilmek için>
    public static <General extends Shapes> General compareArea(General g1, General g2) {
        if (g1.area() > g2.area()) {
            return g1;
        } else {
            return g2;
        }
    }

    public static <General extends Shapes> General compareCircumference(General g1, General g2) {
        if (g1.circumference() > g2.circumference()) {
            return g1;
        } else {
            return g2;
        }
    }
}