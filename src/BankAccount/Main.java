package BankAccount;

public class Main {
    public static void main(String[] args) {
        //Creating a PNB BankAccount
        BankAccount PNB = new BankAccount("Amit Singh",8000901,7000);
        PNB.withdraw(1000);
        PNB.deposit(8000);
        String status = PNB.getBalance()>=5000 ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Current Balance: ₹" + PNB.getBalance());
        System.out.println("Status: " + status);
    }
}
