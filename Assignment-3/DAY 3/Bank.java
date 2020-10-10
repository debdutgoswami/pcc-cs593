class Account {
    String cust_name;
    long accnt_num;
    int type; // 1. Savings 2. Current
    double amount=0.0;
    Account(String name, long accnt_num, int type) {
        this.cust_name = name;
        this.accnt_num = accnt_num;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Name: " + this.cust_name + " account number: " + this.accnt_num + " type: " + this.type;
    }
    void deposit(double amount) throws NotImplementedException {
        throw new NotImplementedException();
    }
    void withdraw(double amount) throws NotImplementedException {
        throw new NotImplementedException();
    }
}

class CurrentAccount extends Account {
    boolean cheque_book=true, interest=false;
    double minimum_bal = 1000.0, service_charge = 100.0;
    CurrentAccount(String cust_name, long accnt_num, int type, double amount){
        super(cust_name, accnt_num, type);
        deposit(amount);
    }
    @Override
    public String toString() {
        return "Current Account " + super.toString() + " balance: " + this.amount;
    }
    @Override
    void deposit(double amount){     
        this.amount = amount;
        if(this.amount<this.minimum_bal){
            System.out.println("Total amount must be more than Rs.1000.00");
            System.out.println("You will be charged a service fee of Rs.100.00");
            this.amount -= service_charge;
        }
    }
    @Override
    void withdraw(double amount){
        double tempAmount = this.amount - amount - 100;
        if(tempAmount<0)
            System.out.println("Insufficient Balance!! Go get a job");
        if (tempAmount<900.0){
            System.out.println("You will be charged a transaction fee of Rs.100.00");
            this.amount = tempAmount;
        }else{
            this.amount = tempAmount+100;
        }
    }
}

class SavingsAccount extends Account {
    boolean cheque_book=false, interest=true;
    SavingsAccount(String cust_name, long accnt_num, int type){
        super(cust_name, accnt_num, type)
    }
    @Override
    public String toString() {
        return "Savings Account " + super.toString() + " balance: " + this.amount;
    }
    @Override
    void deposit(double amount){
        this.amount += amount;
    }
    @Override
    void withdraw(double amount){
        if(this.amount<amount)
            System.out.println("Insufficient Balance!! Go get a job");
        else
            this.amount -= amount;
    }
}

public class Bank {
    public static void main(String[] args) {
        
    }
}
