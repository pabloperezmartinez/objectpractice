package JavaOPP;

import java.util.Date;

import JavaOPP.scoolmanagement.Payment;
import JavaOPP.scoolmanagement.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        Student student = new Student(
            "0000001", 
            "Pablo",
            "Pérez Martínez",
            new Date(1986, 1, 8
            ));
        student.printStudent();
        System.out.println("\n");
        Payment payment = new Payment(
            1,
            student,
            (float)423.23,
            new Date()
        );
        payment.printPayment();
    }
}
