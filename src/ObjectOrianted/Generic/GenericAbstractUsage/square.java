package ObjectOrianted.Generic.GenericAbstractUsage;

public class square extends Shapes {

    private int edge;

    public square(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return edge*edge;
    }

    @Override
    public double circumference() {
        return edge*4;
    }
}
