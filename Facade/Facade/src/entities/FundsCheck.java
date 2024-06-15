package entities;

public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashWithdrawn) { cashInAccount -= cashWithdrawn; }

    public void increaseCashInAccount(double cashDeposited) { cashInAccount += cashDeposited; }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if(cashToWithdrawal > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;

        } else {

            System.out.println("Current balance before the withdrawal: " + getCashInAccount());

            System.out.println("Withdrawal request: " + cashToWithdrawal);

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Current Balance after the withdrawal: " + getCashInAccount());

            return true;

        }

    }

    public void makeDeposit(double cashToDeposit) {

        System.out.println("Current balance before the deposit: " + getCashInAccount());

        System.out.println("Deposit request: " + cashToDeposit);

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Current Balance after the deposit: " + getCashInAccount());

    }
}
