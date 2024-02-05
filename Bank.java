package BankingSystem;
import java.util.ArrayList;

class Bank{
    
    public static ArrayList<CustomerAccount> BankAccounts =new ArrayList<CustomerAccount>(null);
    
    public void addAccount(CustomerAccount account){
        BankAccounts.add(account);
    }
    public void removeAccount(CustomerAccount account){
        BankAccounts.remove(account);
    }
    public static ArrayList<CustomerAccount> getBankAccounts(){
        return BankAccounts;
    }
    public void printBankAccounts(){
        System.out.println(getBankAccounts());
    }

}

class CustomerAccount extends Bank{
    private String accountNumber;
    private String accountHolder;
    private String IFSCcode;

    public CustomerAccount(String accountNumber, String accountHolder, String IFSCcode) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.IFSCcode = IFSCcode;
    }
    public static ArrayList<Account> CustomerAccounts = new ArrayList<Account>();

    public void addAccount(Account account){
        CustomerAccounts.add(account);
    }
    public void removeAccount(Account account){
        CustomerAccounts.remove(account);
    }
    public static ArrayList<Account> getCustomerAccounts(){
        return CustomerAccounts;
    }
    public void printCustomerAccounts(){
        System.out.println(getCustomerAccounts());
    }

    public void getCustomerAccountDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("IFSC code : "+IFSCcode);
    }
}
