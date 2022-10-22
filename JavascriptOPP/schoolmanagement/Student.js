module.exports = class Student {

    constructor(id, firstname, lastname, birthday) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    getId(){
        return this.id;
    }

    getFirstname(){
        return this.firstname;
    }

    getLastName(){
        return this.lastname;
    }

    getBirthDay(){
        return this.birthday;
    }

    getFullName(){
        return this.firstname + ' ' + this.lastname;
    }

    getAge() {
        let diff = Date.now() - this.birthday;
        const dateAge = new Date(diff);
        return Math.floor(dateAge.getUTCFullYear() - 1970);
    }

    printStudentInfo() {
        console.log("\n****** " + this.getFullName() + " *********");
        console.log("ID: "+ this.id);
        console.log("Birth Day: "+ this.birthday);
        console.log("Age: "+ this.getAge());
    }
}