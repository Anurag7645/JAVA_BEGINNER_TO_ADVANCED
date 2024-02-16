package JavaPrograms_lab;

public class ATMtest {
    void withdraw(int amount) 
    {
        System.out.println(amount + " is withdrawn from the account");
    }

    void checkbalance(String name, int balance) 
    {
        System.out.println(name + "'s current balance is: Rs."+balance);
    }

    void deposit(int amount) 
    {
        System.out.println(amount + " has been added to your account.");
    }

    void accountinfo(String name, int accountno, int balance) 
    {
        System.out.println();
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println("Enter your choice:");
        System.out.println( "1. Withdraw money" );
        System.out.println( "2. Check Balance" );
        System.out.print ("3. Deposit money\n4. Account Information:\n");
        int n=Integer.parseInt(args[0]);

        switch (n) {
            case 1:
            {
                System.out.println("How much do you want to withdraw? ");
                int amt=Integer.parseInt(args[1]);
                atm.withdraw(amt);
                break;
            }
            case 2:
            {
                System.out.println( "What's your name?" );
                String name=args[1];
                atm.checkbalance(name, 4000);
                break;
            }
            case 3:
            {
                System.out.println("How much do you want to deposit? ");
                int amt=Integer.parseInt(args[2]);
                atm.deposit(amt);
                break;
            }
            case 4:
            {
                System.out.println( "Name: John Doe" );
                System.out.println( "Account Number: 567890" );
                atm.accountinfo("John Doe", 567890, 4000);
                break;
            }

            default:
             break;
        }
       // atm.accountinfo("John Doe",1234567890, 5000);
       // atm.withdraw(1000);
       // atm.checkbalance("John Doe", 4000);
        //atm.deposit(2000);
       // atm.checkbalance("John Doe", 6000);
    }

