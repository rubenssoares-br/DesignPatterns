package application;


import entities.*;

public class TestBankAccountWithoutFacade {
    public static void main(String[] args) {


        AccountNumberCheck anc = new AccountNumberCheck();
        SecurityCodeCheck scc = new SecurityCodeCheck();
        FundsCheck fd = new FundsCheck();
        WelcomeToBank wtb = new WelcomeToBank();
        BankAccount x = new BankAccount(12345678, 1234);

        depositCash(200, anc, scc, fd, x);
        withdrawCash(200, anc, scc, fd, x);

    }

    public static void depositCash(double cashToDeposit, AccountNumberCheck anc, SecurityCodeCheck scc, FundsCheck fd, BankAccount x) {

        if (anc.accountActive(x.getAccountNumber()) &&
                scc.isCodeCorrect(x.getSecurityCode())) {

            fd.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }
    }

    public static void withdrawCash(double cashToGet, AccountNumberCheck anc, SecurityCodeCheck scc, FundsCheck fd, BankAccount x) {

        if(anc.accountActive(x.getAccountNumber()) &&
                scc.isCodeCorrect(x.getSecurityCode()) &&
                fd.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }
}
