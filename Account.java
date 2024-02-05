package BankingSystem;

interface Account{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;
    public SavingsAccount(double initialDeposit, double interestRate){
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit of $"+amount+" Successful. Savings Account balance : $"+getBalance());
    }
    public void withdraw(double amount) {
        if (balance>=amount) {
            balance-=amount;
            System.out.println("Withdrawl of $"+amount+" Successful. Savings Account balance : $"+getBalance());
        } else {
            System.out.println("Try to withdraw: $"+amount);
            System.out.println("Insufficient funds. Withdrawal failed");
        }
    }
    public void applyInterest(){
        balance+=balance*(interestRate/100);
        System.out.println("your interest amount for your savings : $"+(balance*(interestRate/100)));
        System.out.println("Savings Account Balance : $"+getBalance());
    }
    public double getBalance(){
        return balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    
}
class CurrentAccount implements Account{
   
    private double balance;
    private double overDraftLimit;
    public CurrentAccount(double initialDeposit, double overDraftLimit){
        this.balance = initialDeposit;
        this.overDraftLimit = overDraftLimit;
    }
    public void deposit(double amount) {
        balance+= amount;
        System.out.println("Deposit of $"+amount+" Successful. Current Account balance : $"+getBalance());
    }
    public void withdraw(double amount){
        if (balance+overDraftLimit>=amount) {
            balance-=amount;
            System.out.println("Withdrawl of $"+amount+" Successful. Current Account balance : $"+getBalance());
        } else {
            System.out.println("Try to withdraw: $"+amount);
            System.out.println("Insufficient funds. Withdrawal failed");
        }
    }
    public void setOverDraftLimit(double overDraftLimit){
        this.overDraftLimit = overDraftLimit;
    }
    public double getBalance(){
        return balance;
    }
    public void getOverDraftLimit() {
        System.out.println(overDraftLimit);
    }

}

