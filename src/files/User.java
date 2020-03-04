package files;

import java.beans.Transient;
import java.io.Serializable;

public class User implements Serializable {
    private String adress;
    private String firstname;
    private String lastname;
    private int age;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String firstname, String lastname, Adress adress, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }
}