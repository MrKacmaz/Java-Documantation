package nesne3;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Alperen","KAÇMAZ",-99);
        System.out.println(person.toString());

        Student student = new Student("Asya","KAÇMAZ",-8,271);
        System.out.println(student.toString());

        person.setAge(21);
        System.out.println(person.getAge());


    }



}
