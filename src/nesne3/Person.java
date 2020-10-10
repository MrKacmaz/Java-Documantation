package nesne3;

import java.util.Scanner;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 0;
            System.err.print(" Wrong age");
        } else
            this.age = age;
    }

    @Override
    public String toString() {
        if (this.age == 0) {
            String newAge = "Wrong age";
            return "Name: " + name + "\nSurname: " + surname + "\nAge: " + newAge;
        } else
            return "Name: " + name + "\nSurname: " + surname + "\nAge: " + age;
    }

}
