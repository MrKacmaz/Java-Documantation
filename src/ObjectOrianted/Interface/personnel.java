package ObjectOrianted.Interface;

public class personnel implements compare {
    private int age;

    public personnel(int age) {
        this.age = age;
    }
    public personnel() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String compareTwoObject(Object o) {
        personnel p1 = (personnel)o;
        if (this.getAge()> p1.getAge()){
            return "First Age > Second Age";
        }else if (this.getAge() < p1.getAge()){
            return "First Age < Second Age";
        }
        else return "EQUALS";
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
