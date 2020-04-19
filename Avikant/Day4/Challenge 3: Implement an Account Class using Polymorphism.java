// Write classes code here

class Account{
    protected double balance;

    public Account(double money){
        this.balance = money ;
    }


    
    public void Withdraw(double amount){
        balance = balance - amount ;
    }

    public void Deposit(double amount){
        balance = balance + amount ;

    }

    public void printBalance(){}
}

class Savings extends Account{

    public Savings(double money){
        super(money);
                // super.balance = money ;

    }
    
    private double interestRate = 0.8 ;
    private double directRate = 1 + interestRate ;

    

    // public void Savings(){
    //     super.balance = 50000 ;
    // }

    public void Withdraw(double amount){
        super.balance = super.balance - directRate*amount ;
    }

    public void Deposit(double amount){
        super.balance = super.balance + directRate*amount ;

    }

    public void printBalance(){
        System.out.print("Balance in your savings account: " + super.balance);
    }


}


class Current extends Account{

    public Current(double money){
        super(money);
    }

    // public void Current(){
    //     super.balance = 50000 ;
    // }

    public void printBalance(){
        System.out.print("Balance in your current account: " + super.balance);
    }

}

class demo {
  
    public static void main(String args[]) {
      // make instances of classes here
      // call their traits functions here
// creating savings account object
Account SAccount = new Savings(50000);
    
SAccount.Deposit(1000);
SAccount.printBalance();

SAccount.Withdraw(3000);
SAccount.printBalance();

System.out.println();

// creating current account object
Account CAccount = new Current(50000);
CAccount.Deposit(1000);
CAccount.printBalance();

CAccount.Withdraw(3000);
CAccount.printBalance();


    //   making
      
    }
    
  }