package JavaOPP.scoolmanagement;

import java.util.Date;

/**
 * @author Pablo Pérez Martínez
 */
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String email;
    private String phoneNumber;

    /**
     * Constructor
     * @param id
     * @param firstName
     * @param lastName
     * @param birthday
     * @param email
     * @param phoneNumber
     */
    public Person(String id, String firstName, String lastName, Date birthday, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get id
     * @return string id
     */
    public String getId() {
        return id;
    }

    /**
     * Set id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets first name
     * @return string firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets birthday
     * @return
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Sets birthday
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * gets Email
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets phone number
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets age
     * @return
     */
    public int getAge() {
        long diff = (new Date()).getTime() - this.birthday.getTime();
        return (int) Math.floor(diff / ((1000*60*60*24) % 365));
    }

    /**
     * Gets the full name
     * @return
     */
    public String getFullName () {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Prints person data
     */
    public void print() {
        System.out.println("***** " + this.getFullName() + " ******");
        System.out.println("ID: " + this.id);
        System.out.println("Birth Date: " + this.birthday.toString());
        System.out.println("Age: " + this.getAge());
        System.out.println("Email: " + this.email);
        System.out.println("Phone number: " + this.phoneNumber);
    }
}