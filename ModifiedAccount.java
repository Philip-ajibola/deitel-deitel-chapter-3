public class ModifiedAccount{
    private String name;
    private double balance; 

   
public ModifiedAccount(String name, double balance){
    this.name = name;
   if(balance>0.0){
    this.balance = balance;}
}

   public String getName(){
     return name;
   }
   public void setName(String name){
     this.name = name;
  }
  public void setBalance(double balance){
       if(balance>balance){
         this.balance = balance;
      }
  }
     public void deposit(double depositAmount){
         if(depositAmount>0.0){
           balance = balance + depositAmount;
        }
    }
     public void withdrawal(double withdrawAmount){
           if(withdrawAmount>balance){
           System.out.print("Withdrawal Amount Exceed Account Balance\n");
          }
             if(withdrawAmount<=balance){
                 this.balance = balance - withdrawAmount; 
            }
     }
    

         public double getBalance(){
            return balance ; 
         }

       
            
       
   



}