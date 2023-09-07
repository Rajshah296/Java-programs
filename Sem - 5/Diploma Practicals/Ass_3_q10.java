
class account{
    String Name_of_depositor, acc_type;
    int ano;
    static int NoOfAccounts = 0;
    double bal;
    boolean flag;

    public void deposit(float amount)
    {
        System.out.println("Account no :- " + ano);
        System.out.println("Processing your transaction ... \n");
        bal += amount;
        System.out.println("Amount deposited.");
        System.out.println("Your current balance is : " + this.getbal());
        flag = bal >= 25000.0 ? true : false;
        System.out.println("\n\n");
        
    }
    public void withdraw(float amount){
        if(flag == true)
        {
            System.out.println("Account no :- " + ano);
            System.out.println("Processing your transaction ... ");
            bal -= amount;
            System.out.println("Amount withdrawn.");
            System.out.println("Your current balance is : " + this.getbal() + "\n\n");
            flag = bal < 25000.0 ? false : true;
        }
        else{
            System.out.println("Your account is in the under minimum  balance category.\n You cannot perform any transactions other than deposit.\nPlease deposit minimum required amount before performing any other kinds of transactions.\n\n");
        }
    }

    public double getbal(){return bal;}
    public void display_acc_details(){
        System.out.println("Name of depositor :- " + Name_of_depositor);
        System.out.println("Account no. :- " + ano);
        System.out.println("Account Type :- " + acc_type);
        System.out.println("Current Balance :- " + bal);
        System.out.println("\n\n");
    }
    account(String name , float balance , String acc_type)
    {
        Name_of_depositor = name;
        this.ano = account.NoOfAccounts;
        this.acc_type = acc_type; 
        if(balance >= 25000.0){
            bal = balance;
            flag = true;
        }
        else
        {
            this.bal = balance;
            System.out.println("# Only after depositing the minimum required amount for this account, you can perform transactions.\n# Till then your account shall remain in under minimum  balance category and all transactions other than deposits are restricted.\n\n");
            flag = false;
        }
        account.NoOfAccounts++;
    }
}

public class Ass_3_q10 {
    public static void main(String args[]) {
        account acc_1 = new account("Raj", 250000, "Savings"); // Creating the 1st bank account with sufficient balance to perform transactions. // 
        account acc_2 = new account("Someone poor" , 255 , "Savings"); // Creating the 2nd bank account with insufficient balance to perform transactions.//
        System.out.println("Account details for 2 accounts created : \n");
        acc_1.display_acc_details();
        acc_2.display_acc_details();
        acc_1.deposit(25000);
        acc_1.withdraw(25000);
        acc_2.withdraw(125);
        System.out.println("\n\nThe current balance of Mr.Raj's account is : " + acc_1.getbal());
        System.out.println("\n\nThe current balance of Someone's account is : " + acc_2.getbal());

    }
}