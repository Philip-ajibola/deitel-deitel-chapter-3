import java.util.Scanner;

public class Account2Test{
   public static void main(String[] args){
      Account2 account1 = new Account2();
     
      Scanner input = new Scanner(System.in);
        System.out.print( "Welcome to mavericks bank" );


      System.out.print(" Enter Your id : " );
       int id = input.nextInt();
       account1.setId(id);
       System.out.print("Enter Your initail Account balance \n");
          double balance = input.nextDouble();
                account1.setBalance(balance);
       System.out.print("Enter Your annualInterestRate \n");
             double annualInterestRate = input.nextDouble ();
                account1.setAnnualInterestRate(annualInterestRate);

       
                   
     System.out.print("Enter the date your account was created: \n");
         String  dateCreated = input.next();
           account1.setDate(dateCreated);
           

         System.out.print("Would You Like to Withdraw (Yes or NO) : \n");
               String withdraw = input.next();
            if(withdraw.equals("yes")){
                 System.out.print("Enter The Amount You Want To withdraw\n");
                          double withdrawAmount = input.nextDouble();
                         account1.withdrawal(withdrawAmount); 
             }else{System.out.print("okay thank\n");}
   

        System.out.print("Would You Like to Deposit (Yes or NO) : \n");
               String deposit = input.next();
            if(deposit.equals("yes")){
                 System.out.print("Enter The Amount You Want To Deposit\n");
                          double depositAmount = input.nextDouble();
                           account1.deposit(depositAmount); 
             }else{System.out.print("okay thank\n");}


      System.out.printf("Your New Account Balance is: %.2f%n",account1.getBalance());
       
      System.out.printf("Your Monthly Interest  is %.2f%n",account1.getMonthlyInterest());
     
      System.out.print("Thank You For Banking With Us");
    

      

   


  

    

     }





}