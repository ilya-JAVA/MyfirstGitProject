package main.java.by.itstep.boris.oop;

public class Employee extends Person{
   // @Override
    public void sayHi(){
        System.out.println("HELLOOOOOOOOOOOOOOOO");
    }

    public Employee(){

    }

    public Employee(String firstname, String lastname, String surname, int age) {
        super.setFirstname(firstname);
        super.setLastname(lastname);
        super.setSurname(surname);
        super.setAge(age);
    }
    //    private String firstname;
////    private String lastname;
////    private String surname;
////    private int age;
////
////    public String getFirstname() {
////        return firstname;
////    }
////
////    public void setFirstname(String firstname) {
////        this.firstname = firstname;
////    }
////
////    public String getLastname() {
////        return lastname;
////    }
////
////    public void setLastname(String lastname) {
////        this.lastname = lastname;
////    }
////
////    public String getSurname() {
////        return surname;
////    }
////
////    public void setSurname(String surname) {
////        this.surname = surname;
////    }
////
////    public int getAge() {
////        return age;
////    }
////
////    public void setAge(int age) {
////        this.age = age;
////    }
////
////    public void sayHello() {
////        System.out.println("Hi! My name is"+ lastname );
////    }
////
////    public Employee(){
////
////    }
////    public Employee(String firstname, String lastname, String surname, int age) {
////        this.firstname = firstname;
////        this.lastname = lastname;
////        this.surname = surname;
////        this.age = age;
////    }
////
////    @Override
////    public String toString() {
////        return "Employee{" +
////                "firstname='" + firstname + '\'' +
////                ", lastname='" + lastname + '\'' +
////                ", surname='" + surname + '\'' +
////                ", age=" + age +
////                '}';
////    }
}



