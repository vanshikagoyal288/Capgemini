
public class Bank {
    static class BankAccount{
        static String bankName = "SBI";
        static int totalAccounts = 0;

        String accountHolderName;
        final int accountNumber;

        BankAccount(String accountHolderName,int accountNumber){
            this.accountHolderName=accountHolderName;
            this.accountNumber=accountNumber;
            totalAccounts++;
        }

        static void getTotalAccounts(){
             System.out.println("Total Accounts " + totalAccounts);
        }

        void display(Object obj) {
            if (obj instanceof BankAccount) {
                BankAccount b = (BankAccount) obj;
                System.out.println("Bank Name " + bankName);
                System.out.println("Account Holder " + b.accountHolderName);
                System.out.println("Account Number " + b.accountNumber);
            } else {
                System.out.println("Not a BankAccount object");
            }
        }

    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount("rachit",1001);
        BankAccount c = new BankAccount("rachit2",1002);

        
        b.display(b);
        c.display(c);

        BankAccount.getTotalAccounts();
    }
}
