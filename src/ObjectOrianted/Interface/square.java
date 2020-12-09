package ObjectOrianted.Interface;

public class square implements compare {
    private int oneEdgeOfLength;

    public square(int oneEdgeOfLength) {
        this.oneEdgeOfLength = oneEdgeOfLength;
    }
    public square() {}

    public int getOneEdgeOfLength() {
        return oneEdgeOfLength;
    }

    public void setOneEdgeOfLength(int oneEdgeOfLength) {
        this.oneEdgeOfLength = oneEdgeOfLength;
    }

    public int area(){
        return oneEdgeOfLength*oneEdgeOfLength;
    }

    @Override
    public String compareTwoObject(Object o) {
        square s1 = (square) o;
        if (this.area() > s1.area()){
            return "First Area > Second Area";
        }else if (this.area() < s1.area()){
            return "First Area < Second Area";
        }else return "EQUALS";
    }

    @Override
    public int minus(int a, int b) {
        int sum = a-b;
        if (sum<0){
            return -sum;
        }else
            return sum;
    }
}
