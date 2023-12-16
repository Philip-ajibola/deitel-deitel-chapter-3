import java.util.Scanner;

public class ModifiedAccountTest{
   public static void main(String[] args){
      ModifiedAccount account1 = new ModifiedAccount("patrick jame",50.00);
      ModifiedAccount account2 = new ModifiedAccount("James Goerge",-7.53);
      Scanner input = new Scanner(System.in);

    
     System.out.printf("%S balance: %.2f%n",account1.getName(),account1.getBalance());
     System.out.printf("%S balance: %.2f%n",account2.getName(),account2.getBalance());

    System.out.print("Enter the amount You want deposit for account1: ");
       double  depositAmount = input.nextDouble();
         account1.deposit(depositAmount);    
    System.out.printf("adding %.2f to account1 balance%n",depositAmount);

     System.out.printf("%S balance: %.2f%n",account1.getName(),account1.getBalance());
      System.out.printf("%S balance: %.2f%n",account2.getName(),account2.getBalance());

   System.out.print("Enter The Amount You to deposit for account2: ");
      double  depositAmount2 = input.nextDouble();
      account2.deposit(depositAmount2);    
    System.out.printf("adding %.2f to account2 balance%n",depositAmount);

     System.out.printf("%S balance: %.2f%n",account1.getName(),account1.getBalance());
      System.out.printf("%S balance: %.2f%n",account2.getName(),account2.getBalance());


System.out.print("Enter The Amount You to withdrawal for account1: ");
      double withdrawAmount = input.nextDouble();
      account1.withdrawal(withdrawAmount);    
     System.out.printf("%S balance: %.2f%n",account1.getName(),account1.getBalance());
      System.out.printf("%S balance: %.2f%n",account2.getName(),account2.getBalance());

    

System.out.print("Enter The Amount You to withdraw for account2: ");
     double withdrawAmount2 = input.nextDouble();
      account2.withdrawal(withdrawAmount2);    
      System.out.printf("%S balance: %.2f%n",account2.getName(),account2.getBalance());
      System.out.printf("%S balance: %.2f%n",account1.getName(),account1.getBalance());










   } 




}