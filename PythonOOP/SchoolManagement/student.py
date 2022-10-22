import datetime
import string

class Student:

    def __init__(self, id, name, lastname, birthday) -> None:
        self.__id = id
        self.__name = name
        self.__lastname = lastname
        self.__birthday = birthday
        pass
    

    def get_id (self) -> string:
        """Gets the student id

        Returns:
            string: the id
        """

        return self._id


    def set_id (self, id) -> None:
        """Sets the student id

        Args:
            id (string): the id of the string
        """

        self._id = id

    id = property (get_id, set_id)


    def get_name (self) -> string:
        """Gets the student firstname

        Returns:
            string: the student firstname
        """

        return self.__name


    def set_name (self, student_name) -> None:
        """Sets the student first name

        Args:
            student_name (string): the student name
        """

        self.__name = student_name

    name = property (get_name, set_name)


    def get_lastname (self) -> string:
        """Gets the student lastname

        Returns:
            lastname: the student lastname
        """

        return self.__lastname


    def set_lastname (self, student_lastname) -> None:
        """Sets the student lastname

        Args:
            student_lastname (string): lastname
        """

        self.__lastname = student_lastname

    lastname = property (get_lastname, set_lastname)


    def get_birthday (self) -> string:
        """Gets the student Birthday

        Returns:
            datetime: The student birthday
        """

        return self.__birthday


    def set_birthday (self, birthday) -> string:
        """Sets the student birthday

        Args:
            datetime (Date): The student's birthday
        """

        self.__birthday = birthday

    birthday = property (get_birthday, set_birthday)

    def get_age(self) -> int:
        date_diff = datetime.datetime.now() - self.__birthday
        return int(date_diff.total_seconds() / (365.25*24*60*60))

    def print_data (self) -> None:
        """Prints the student data
        """

        print('***** ' + self.__name + ' ' + self.__lastname + ' ******')
        print('id: ' + self.__id)
        print('birthday: ' + self.__birthday.strftime("%Y/%m/%d"))
        print('age: ' + str(self.get_age()))