package main.java.by.itstep.boris.oop;

import java.util.Objects;

public abstract class Person {
    private String firstname;
    private String lastname;
    private String surname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hi! My name is"+ lastname );
    }

    public abstract void sayHi();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, surname, age);
    }
}

