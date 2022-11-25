package JavaOPP.scoolmanagement;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person {
    private int level;

    /**
     * Constructor
     * @param id
     * @param firstName
     * @param lastName
     * @param birthday
     * @param email
     * @param phoneNumber
     * @param level
     */
    public Student(String id, String firstName, String lastName, LocalDate birthday, String email, String phoneNumber,
            int level) {
        super(id, firstName, lastName, birthday, email, phoneNumber);
        this.level = level;
    }

    /**
     * Gets level
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets level
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }    
    
    /**
     * Prints the student
     */
    @Override
    public void print() {
        // TODO Auto-generated method stub
        super.print();
        System.out.println("Level: " + this.level);
    }

    @Override
    public String getFullName() {
        // TODO Auto-generated method stub
        return super.getFullName();
    }
}