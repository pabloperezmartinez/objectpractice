const Student = require('./schoolmanagement/Student.js')
const Payment = require('./schoolmanagement/Payment.js')

student = new Student('060123233','Pablo', 'Perez', new Date(1986, 1, 8));
student.printStudentInfo();
payment = new Payment(1, 32.21, student, new Date());
payment.printInvoice();
