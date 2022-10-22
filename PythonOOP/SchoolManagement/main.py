from datetime import datetime
from payment import Payment
from student import Student

print('\n')

def main():
    test_student = Student('00001','Pablo', 'Perez Martinez', datetime(1986, 1, 8))
    print(test_student.print_data())

    test_payment = Payment( 1, test_student, 44.23, datetime(2022, 1, 8))
    test_payment.print_payment();
  
if __name__== "__main__":
    main()

print('\n')