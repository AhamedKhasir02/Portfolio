package BankingSystem;

class User {
    public static void main(String a[]){

        Bank b = new Bank();
        CustomerAccount c1 = new CustomerAccount("1212432", "Vaver", "ICUB003");
        CustomerAccount c2 = new CustomerAccount("1212765", "Ahamed", "ICUB023");
        CustomerAccount c3 = new CustomerAccount("1212786", "Hashir", "ICUB423");
        
        b.addAccount(c1);
        b.addAccount(c2);
        b.addAccount(c3);

        SavingsAccount sac1 = new SavingsAccount(2000, 1.3);
        CurrentAccount cac1 = new CurrentAccount(1500, 500);

        c1.addAccount(sac1);
        c1.addAccount(cac1);

        SavingsAccount sac2 = new SavingsAccount(8000, 1.3);
        CurrentAccount cac2 = new CurrentAccount(3500, 500);

        c2.addAccount(sac2);
        c2.addAccount(cac2);

        SavingsAccount sac3 = new SavingsAccount(11000, 1.3);
        CurrentAccount cac3 = new CurrentAccount(7000, 500);
        
        c3.addAccount(sac3);
        c3.addAccount(cac3);

        sac1.deposit(3000);
        
    }
}
