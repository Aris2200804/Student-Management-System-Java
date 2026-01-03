import java.util.Scanner;
class BankAccount{
    private String Cname,AccType;
    private double balance;
    private int AccNumber;
    BankAccount(int AccNumber,String Cname,String AccType,double balance)
    {
        this.Cname=Cname;
        this.AccType=AccType;
        this.balance=balance;
        this.AccNumber=AccNumber;
    }
    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Amount Deposited Successfully");
    }
    void withdrawl(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println("Amount Withdrwal Successfull");
        }
        else 
        {
            System.out.println("Insufficent Balance");
        }
    }
    void checkBalance()
    {
        System.out.println("Current Balance:"+balance);
    }
}
public class BankAccountManagerment
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String Cname,AccType;
        double balance,amount=0,withdrawl;
        int AccNumber=0,x,count=0,i,acnumber;
        BankAccount[] accounts=new BankAccount[3];
        do{
            System.out.println("\n--------------Bank Account Managment System---------------");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdrawl");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");
            System.out.print("Enter  Your Choice:");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                {
                        System.out.print("Enter Account Number:");
                        AccNumber=sc.nextInt();
                        System.out.print("Enter Account Holder Name:");
                        Cname=sc.next();
                        System.out.print("Enter Account Type:");
                        AccType=sc.next();
                        System.out.print("Enter Intital Balance:");
                        balance=sc.nextDouble();
                        accounts[count]=new BankAccount(AccNumber,Cname,AccType,balance);
                        count++;
                        System.out.println("Account Created Successfully");
                        if(count==accounts.length)
                        {
                            System.out.println("Cannot Create New Account");
                        }
                        break;
                 }
                case 2:
                {
                    System.out.print("Enter Account Number You want to Deposit:");
                    acnumber=sc.nextInt();
                    if(acnumber==AccNumber)
                        {
                            System.out.print("Enter Amount to Deposit:");
                            amount=sc.nextDouble();
                            for(i=0;i<count;i++)
                                {
                                    accounts[i].deposit(amount);
                                }
                            
                         }
                        else
                        {
                            System.out.println("Account Does Not Exist");
                        }
                        break;
                }
                case 3:
                {
                    System.out.print("Enter Account Number You want to Withdrawl:");
                    acnumber=sc.nextInt();
                    if(acnumber==AccNumber)
                    {   
                    System.out.print("Enter Withdrawl Amount:");
                    withdrawl=sc.nextDouble();
                    for(i=0;i<count;i++)
                    {
                        accounts[i].withdrawl(withdrawl);
                    }
                    }
                    else
                    {
                        System.out.println("Account Does Not Exist");
                    }
                    break;
                }
                case 4:
                    {
                        System.out.print
                        ("Enter Account Number You want to Check Balance:");
                        acnumber=sc.nextInt();
                        if(acnumber==AccNumber)
                        {
                        for(i=0;i<count;i++)
                        {   
                            accounts[i].checkBalance();
                        }
                        }
                        else
                        {
                            System.out.println("Account Does Not Exist");
                        }
                    }
                    break;
                case 5:
                    {
                        System.out.println("Exiting Program.Thank You");
                        break;
                    }
                default:
                    System.out.println("Invalid Choice,Try Again");
            }
        }while(x!=5);
    }
}
