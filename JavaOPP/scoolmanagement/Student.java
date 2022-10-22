package JavaOPP.scoolmanagement;

import java.util.Date;

public class Student {
    private String id;
    private String firstname;
    private String lastname;
    private Date birthDate;


    public Student(String id, String firstname, String lastname, Date birthDate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFullName () {
        return this.firstname + " " + this.lastname;
    }

    public double getAge() {
        long diff = (new Date()).getTime() - this.birthDate.getTime();
        return Math.floor(diff / ((1000*60*60*24) % 365));
    }

    public void printStudent() {
        System.out.println("***** " + this.getFullName() + " ******");
        System.out.println("ID: " + this.id);
        System.out.println("Birth Date: " + this.birthDate.toString());
        System.out.println("Age: " + this.getAge());
    }
}