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
            new Date(1986, 1, 8),
            "paperez@puce.edu.ec",
            "+593 98 330 9406",
            2
            );
        
        student.print();
    }
}
