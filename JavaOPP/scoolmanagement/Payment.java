package JavaOPP.scoolmanagement;

import java.text.DecimalFormat;
import java.util.Date;

public class Payment {
    private int id;
    private Student student;
    private float amount;
    private Date paymentDate;


    public Payment(int id, Student student, float amount, Date paymentDate) {
        this.id = id;
        this.student = student;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void printPayment() {
        System.out.println("***** Invoice No. " + this.id + " ******");
        System.out.println("Student: " + this.student.getFullName());
        DecimalFormat amountFormat = new DecimalFormat("0.00");
        System.out.println("Amount: " + amountFormat.format(this.amount));
        System.out.println("Date: " + this.paymentDate.toString());
    }
}
