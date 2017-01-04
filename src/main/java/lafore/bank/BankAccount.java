package lafore.bank;

class BankAccount {

    private double balance; // account balance

    public BankAccount(double balance) { // constructor
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void display() {
        System.out.println("balance=" + balance);
    }
}
