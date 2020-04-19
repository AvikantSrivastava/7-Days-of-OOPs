class Accounts {
    protected double balance;
    //default constructor
    public Accounts(){
        balance = 0;
    }
    //parameterized constructor
    public Accounts(double balance){
        this.balance = balance;
    }
    public void Withdraw(double amount){

    }
    public void Deposit(double amount){

    }
    public void printBalance(){
        System.out.println("Balance in your account is : " + balance);
    }
}
class Savings extends Accounts{
    private final double interestRate = 0.8;
    public Savings(double balance){
        super(balance);
    }
    public void Withdraw(double amount) {
        balance = balance - (amount * interestRate);
    }
    public void Deposit(double amount){
        balance = balance + (amount * interestRate);
    }
    public void printBalance(){
        System.out.println("Balance in your saving account is: " + balance);
    }
}

class Current extends Accounts{
    public Current(double balance){
        super(balance);
    }
    public void Withdraw(double amount){
       balance -= amount;
    }
    public void Deposit(double amount){
        balance += amount;
    }
    public void printBalance(){
        System.out.println("Balance in your current account is : " + balance);
    }
}
class main{
    public static void main(String args[]){
        Accounts save = new Savings(50000);
        save.Deposit(1000);
        save.printBalance();
        save.Withdraw(3000);
        save.printBalance();

        System.out.println();

        Accounts current = new Current(50000);
        current.Deposit(1000);
        current.printBalance();
        current.Withdraw(3000);
        current.printBalance();
    }
}