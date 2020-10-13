package ObjectOrianted.nesne3;

public class Student extends Person{
    private int schoolNum;

    public Student(String name, String surname, int age, int schoolNum) {
        super(name, surname, age);
        this.schoolNum = schoolNum;
    }

    public int getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(int schoolNum) {
        this.schoolNum = schoolNum;
    }

    @Override
    public String toString() {

        return super.toString() + "\nSchool Number: " + schoolNum;

        }
}
