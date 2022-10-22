module.exports = class Payment {
    
    constructor(id, amount, student, paymentDate) {
        this.id = id;
        this.student = student;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    getId() {
        return this.id;
    }

    getStudent() {
        return this.student;
    }

    getAmount() {
        return this.amount;
    }

    getPaymentDate() {
        return this.paymentDate;
    }

    printInvoice() {
        console.log("\n");
        console.log("**** Invoice No. " + this.id + "   ******");
        console.log("Estudiante: " + this.student.getFullName());
        console.log("Amount: $" + this.amount.toFixed(2));
        console.log("Payment Date: " + this.paymentDate.toString());
        console.log("\n");
    }

}