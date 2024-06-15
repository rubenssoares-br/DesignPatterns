package entities;

public class BankAccount {
    private int accountNumber;
    private int securityCode;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public BankAccount(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
    }

}
