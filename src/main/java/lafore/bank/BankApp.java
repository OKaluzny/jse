package lafore.bank;

class BankApp {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(100.00);
        BankAccount ba2 = ba1;

        System.out.print("Before transactions, ");
        ba1.display();

        ba1.deposit(74.35);
        ba1.withdraw(20.00);
        ba1.withdraw(12);

        System.out.print("After transactions, ");
        ba1.display();

        if (ba1 == ba2) { //--
            System.out.println("They are equal");
        }

        if (ba1.equals(ba2)) {
            System.out.println("They are equal");
        }
    }
}
