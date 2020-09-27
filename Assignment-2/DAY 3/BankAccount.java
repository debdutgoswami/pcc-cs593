import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BankAccount {
    String name, address;
    long accnt_num;
    double bal;
    BankAccount(String name, String address, long accnt_num, double bal) {
        this.name = name;
        this.address = address;
        this.accnt_num = accnt_num;
        this.bal = bal;
    }
    void deposit(double bal){
        this.bal += bal;
    }
    void withdraw(double bal){
        this.bal -= bal;
    }
    public String toString(){
        return "<BankAccount(name = " + this.name + ", address = " + this.address + ", accnt_num = " + this.accnt_num + ", balance = " + this.bal + ">";
    }
    public static void main(String[] args) throws Exception, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>(3);
        bankAccounts.add(new BankAccount("Debdut Goswami", "Somewhere under the sky", 123456789, 5000.00));
        bankAccounts.add(new BankAccount("hello OP", "Somewhere under the earth", 987654321, 500.00));
        bankAccounts.add(new BankAccount("Yo boi ssup", "Somewhere under the sun", 000000000, 50000.00));
        System.out.print("Enter your account number: ");
        long search = Long.parseLong(buf.readLine());
        System.out.print("Deposit(1)/Withdraw(2): ");
        int choice = Integer.parseInt(buf.readLine());
        if (choice != 1 && choice != 2) throw new Exception("Invalid choice");
        System.out.print("Amount: ");
        double amount = Double.parseDouble(buf.readLine());
        boolean flag = false;
        for(BankAccount obj: bankAccounts)
            if(obj.accnt_num==search){
                flag = true;
                if(choice==1)
                    obj.deposit(amount);
                else
                    obj.withdraw(amount);  
                System.out.println(obj);
            }
        if(!flag) System.out.println("Account number not found!! Kindly check the account number entered.");
    }
}
