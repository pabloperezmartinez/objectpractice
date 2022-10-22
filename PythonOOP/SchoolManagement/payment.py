from datetime import datetime
from student import Student

class Payment:

    def __init__(self, id, student, amount, payment_date) -> None:
        """Constructor

        Args:
            id (string): the payment id
            student (Student): An student instance
            amount (int): The payment amount
            payment_date (datetime): The payment date
        """
        self.__id = id
        self.__student = student
        self.__amount = amount
        self.__payment_date = payment_date
        pass

    def get_id(self) -> int:
        """Gets the id

        Returns:
            int: The id
        """
        return self.__id

    def set_id(self, id) -> None:
        """Sets the id

        Args:
            id (int): The payment id
        """
        self.__id = id
    
    id = property (get_id, set_id)

    def get_student(self) -> Student:
        """Gets Student

        Returns:
            Student: The student who did the payment
        """
        return self.__student
    
    def set_student(self, student) -> None:
        """Sets the student

        Args:
            student (Student): The student who is doing the payment
        """
        self.__student = student

    student = property (get_student, set_student)

    def get_amount(self) -> float:
        """Gets the amount

        Returns:
            float: the amount
        """
        return self.__amount
    
    def set_amount(self, amount) -> None:
        """Sets the amount

        Args:
            amount (float): the amount
        """
        self.__amount = amount
    
    amount = property(get_amount, set_amount)

    def get_payment_date(self) -> datetime:
        """Gets the payment date

        Returns:
            datetime: The paument date
        """
        return self.__payment_date

    def set_payment_date(self, payment_date) -> None:
        """Sets the payment date

        Args:
            payment_date (datetime): The payment date
        """
        self.__payment_date = payment_date
    
    payment_date = property(get_payment_date, set_payment_date)

    def print_payment(self) -> None:
        """Prints the payment
        """
        print("***** Invoice no: " + str(self.__id) + " *************")
        print("Student's name: " + self.__student.get_name() + " " + self.__student.lastname)
        print("%.2f" %  self.amount)
        print("Date of payment: " + self.__payment_date.strftime("%Y/%m/%d"))
