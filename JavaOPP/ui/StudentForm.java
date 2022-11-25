package JavaOPP.ui;

import java.util.ArrayList;
import java.awt.GridLayout;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import JavaOPP.scoolmanagement.Student;

public class StudentForm extends JFrame{
    private ArrayList<Student> students = new ArrayList<Student>();
    private JTextField idTextField = new JTextField(), firstNameTextField = new JTextField(), lastNameTextField = new JTextField() , emailTextField = new JTextField(), phoneNumberTextField = new JTextField();
    private JLabel idLabel = new JLabel(), firstNameLabel = new JLabel(), lastNameLabel = new JLabel(), emailLabel = new JLabel(), phoneNumberLabel = new JLabel();
    private JButton saveButton = new JButton("Guardar");
    private JPanel formPanel;
    private StudentList studentList;

    public StudentForm(ArrayList<Student> students, StudentList studentList) {

        this.students = students;
        this.studentList = studentList;
        this.setTitle("Formulario de estudiante");
        this.formPanel = new JPanel();
        this.formPanel.setLayout(new GridLayout(6, 2));
        this.idLabel.setText("Cédula: ");
        this.firstNameLabel.setText("Nombre: ");
        this.lastNameLabel.setText("Apellido: ");
        this.emailLabel.setText("Email: ");
        this.phoneNumberLabel.setText("Teléfono: ");
        this.saveButton.addActionListener(e -> this.addStudent());

        formPanel.add(this.idLabel);
        formPanel.add(this.idTextField);
        formPanel.add(this.firstNameLabel);
        formPanel.add(this.firstNameTextField);
        formPanel.add(this.lastNameLabel);
        formPanel.add(this.lastNameTextField);
        formPanel.add(this.emailLabel);
        formPanel.add(this.emailTextField);
        formPanel.add(this.phoneNumberLabel);
        formPanel.add(this.phoneNumberTextField);
        formPanel.add(this.saveButton);
        this.setLayout(new GridLayout(2, 1));

        this.add(this.formPanel);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        this.setSize(350, 800);
    }

    @Override
    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
        super.setVisible(b);
    }
    
    private void addStudent() {
        Student newStudent = new Student(
            this.idTextField.getText(),
            this.firstNameTextField.getText(),
            this.lastNameTextField.getText(),
            LocalDate.of(1986, 1, 8) ,
            this.emailTextField.getText(),
            this.phoneNumberTextField.getText(),
            3
        );
        this.students.add(newStudent);
        this.studentList.setStudents(this.students);
        this.setVisible(false);
        
    }
}
