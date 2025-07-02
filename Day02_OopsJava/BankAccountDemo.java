package Day02_OopsJava;

abstract class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int a, double b) {
        this.accountNumber = a;
        this.balance = b;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposite(double amount);

    public abstract void withdraw(double amount);

    protected void setBalance(double b) {
        this.balance = b;
    }

}

class SavingAccount extends BankAccount {

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposite(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(123456, 1000.00);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: ₹" + account.getBalance());

        account.deposite(500.00);
        account.withdraw(300.00);
        account.withdraw(15000.00);

        System.out.println("Final Balance: ₹" + account.getBalance());

    }
}
