import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.io.*;
class Main
{
    public static int Amt;
    public static int wamt;
    public static void main(String[] args)
    {
     
     int i;
     Scanner sc=new Scanner(System.in);
     
     int Denomination[]=new int[4];
     int amount;
      boolean loop = true;

     System.out.println("*********************WELCOME TO ATM************************");
    
    int lock=1;
    while (lock<=3)
        {
        System.out.println("Admin Please enter your Username:");
        String Admin_username=sc.next();
        System.out.println("Admin Please enter your Pin:");
        String Admin_pin=sc.next();
        String username="Admin";
        String pin="1234";
        
        
        if(Admin_username.equals(username) && Admin_pin.equals(pin))
        {
            break;
        }
        lock+=1;
        }
        if (lock ==4) 
        {
        System.out.println("Sorry,Your Account is locked");
        System.exit(0);
       
        }
        while (loop)
        {
            System.out.println("1.Deposit the money in ATM machine");
            System.out.println("2.User Login");
            System.out.println("3.Exit");
            int choice=sc.nextInt();
            switch(choice)
                {
                    case 1:
                        System.out.flush();
                        System.out.println("Enter the denomination of amount");
                        System.out.println("Enter the 2000 count : ");
                        Denomination[0] = sc.nextInt() * 2000;
                        System.out.println();
                        System.out.print("Enter the 500 count :");
                        Denomination[1] = sc.nextInt() * 500;
                        System.out.println();
                        System.out.print("Enter  the 200 count : ");
                        Denomination[2] = sc.nextInt() * 200;
                        System.out.println();
                        System.out.print("Enter the 100 count : ");
                        Denomination[3] = sc.nextInt() * 100;
                         amount=(Denomination[0])+(Denomination[1])+(Denomination[2])+(Denomination[3]);
                        System.out.println("The total amount deposited is: "+ amount);
                        loop = true;
                        break;
                        
                    case 2:
                        System.out.println("WELCOME USER");
                        loop=true;
                        User();
                        break;
                       
                    case 3:
                          loop=false;
                           System.exit(0);
                           break;
                        }
                    }
    }
    public static void  User()
    {
       
        int repeat=1;
        Scanner we=new Scanner(System.in);
        System.out.println("Please enter your username:");
        String User_username=we.next();
        System.out.println("Please enter your pin:");
        String User_pin=we.next();
        String username="User";
        String pin ="1234";
        if(User_username.equals(username) && User_pin.equals(pin))
        {
        while (repeat!=0)
        {
            int amount;
            int balance=5000;
            int user_trans[]=new int[4];
            int k=0;
            int Deno[]=new int[4];
            System.out.println("1.Deposit");
            System.out.println("2.Check Balance");
            System.out.println("3.Withdrawl");
            System.out.println("4.Mini statement");
            System.out.println("5.back to main menu");
            System.out.println("Please select your option:");
            int options=we.nextInt();
            switch(options) 
            {
                case 1:
                        System.out.println("Enter the denomination of amount");
                        System.out.println("Enter the 2000 count : ");
                        Deno[0] = we.nextInt() * 2000;
                        System.out.println();
                        System.out.print("Enter the 500 count :");
                        Deno[1] = we.nextInt() * 500;
                        System.out.println();
                        System.out.print("Enter  the 200 count : ");
                        Deno[2] = we.nextInt() * 200;
                        System.out.println();
                        System.out.print("Enter the 100 count : ");
                        Deno[3] = we.nextInt() * 100;
                        amount=(Deno[0])+(Deno[1])+(Deno[2])+(Deno[3]);
                        Amt = amount;
                        System.out.println("The total amount deposited is: "+ amount);
                        balance=balance+amount;
                        user_trans[k]=user_trans[k]+1;
                        repeat=1;
                        break;
                        case 2:
                             balance=balance+Amt;
                            System.out.println("your account balance is: "+ balance);
                            repeat=1;
                            break;
                            case 3:
                            System.out.println("Enter the Amount to be withdrawn: ");
                            wamt=we.nextInt();
                            if(wamt>=balance)
                            {
                               balance=balance-wamt;
                                System.out.println("Collect your cash:"+wamt);
                                user_trans[k]+=k;
                            }
                            else
                            {
                                System.out.println("Insufficient balance");
                            }
                            repeat=1;
                            break;
                            case 4:
                                System.out.println("The Mini Statement of the user: "+User_username);
                                LocalDateTime da = LocalDateTime.now();
                                DateTimeFormatter dob = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                                String formattedDate = da.format(dob);
                                System.out.println("The Date and Time of transaction is:" +formattedDate);  
                                System.out.println("The amount deposited is: "+ Amt);
                                System.out.println("The amount withdrawn is: "+wamt);
                                System.out.println("The balance in your Account is: "+balance);
                                
                                repeat=1;
                            case 5:
                                repeat=0;
                                System.exit(1);
                              }    
                             }
                          }
                        }
}
