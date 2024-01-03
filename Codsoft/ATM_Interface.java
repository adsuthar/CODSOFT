import java.util.Scanner;
public class ATM_Interface
{
    static Scanner scan=new Scanner(System.in);
    static class ATM
    {
        ACCOUNT o=new ACCOUNT();
        int withdraw()
        {
            System.out.print("\nWITHDRAW AMOUNT\nenter amount: ");
            float n=scan.nextFloat();
            if(n>o.balance)
            {
                System.out.println("INSUFFICIENT FUNDS");
                return 1;
            }
            else
            {
                o.balance-=n;
                System.out.println("WITHDRAW SUCCESFUL");
                return 0;
            }
        }
        void deposit()
        {
            System.out.println("\nDEPOSIT AMOUNT\nenter amount: ");
            float n=scan.nextFloat();
            o.balance+=n;
            System.out.println("DEPOSIT SUCCESFUL");
        }
        void enquiry()
        {
            System.out.println("\nCURRENT BALANCE\n"+o.balance);
        }
    }
    static class ACCOUNT
    {
        float balance=0;
        
    }
    public static void main(String[] args)
    {
        System.out.println("ATM INTERFACE");
        ATM o=new ATM();
        while(true)
        {
            System.out.println("\n 1. Withdraw Amount\n2. Deposit Amount\n3. Check Balance\n4. Exit");
            int n=scan.nextInt();
            switch(n)
            {
                case 1:
                    if(o.withdraw()==1)
                    {
                        o.enquiry();
                    }
                    break;
                case 2:
                    o.deposit();
                    break;
                case 3:
                    o.enquiry();
                    break;
                case 4:
                    System.out.println("THANK YOU!!!!!");
                    System.exit(0);
                default:
                    System.out.println("INVALID REQUEST");
            }
        }
    }
}