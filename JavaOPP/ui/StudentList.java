package JavaOPP.ui;

import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import JavaOPP.scoolmanagement.Student;

public class StudentList extends JFrame {

    private JButton addStudentBtn;
    private ArrayList<Student> students = new ArrayList<Student>();
    private JTable studentsTable;
    private DefaultTableModel studentsTableModel;

    /**
     * Constructor
     */
    public StudentList() {
        this.setTitle("Lista de estudiantes");
        addStudentBtn = new JButton("Agregar estudiante");
        addStudentBtn.setBounds(100, 100, 115, 55);
        this.addStudentBtn.addActionListener(e -> this.displayStudentForm());
        this.setSize(400, 300);
        this.add(addStudentBtn);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.students.add(
            new Student(
                "032123",
                "Pablo",
                "Perez",
                LocalDate.of(1986, 1, 8),
                "paperez@puce.edu.ec",
                "+593 98 330 9406",
                4)
            );
        this.generateStudentTablemodel();
        this.studentsTable = new JTable(this.studentsTableModel);
        this.studentsTable.setBounds(10, 10, 600, 300);
        this.add(studentsTable);
    }

    /**
     * Generates Student Model
     */
    private void generateStudentTablemodel() {
        String headers[] = {"ID", "Nombre completo", "Fecha de nacimiento"};
        this.studentsTableModel = new DefaultTableModel(headers, 0);
        this.students.forEach( student -> {
            Object[] obj = {student.getId(), student.getFullName(), student.getAge()};
            this.studentsTableModel.addRow(obj);
            student.print();
        });
    }


    /**
     * Sets visible JFrame
     */
    @Override
    public void setVisible(boolean isVisible) {
        // TODO Auto-generated method stub
        super.setVisible(isVisible);
    }

    /**
     * Displays student form
     */
    private void displayStudentForm() {
        StudentForm studentForm = new StudentForm(this.students, this);
        studentForm.setVisible(true);
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        this.generateStudentTablemodel();
        this.studentsTable = new JTable(this.studentsTableModel);
    }
}
