package BankAccount;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    BankAccount(String accountHolderName, int accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    int getBalance(){
        return balance;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
    void deposit(int money){
        if(money>0)
            balance+=money;
        else
            System.out.println("Enter Correct amount ");
    }
    void withdraw(int money){
        if(money<balance)
            balance-=money;
        else
            System.out.println("Entered Amount should be less than Current Balance");
    }

}
