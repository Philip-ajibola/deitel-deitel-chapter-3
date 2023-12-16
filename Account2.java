public class Account2{
    private int id;
    private double balance;
    private double annualInterestRate;
    private String date; 

    public Account2(){

     }
     public void setId(int id){
     this.id = id;
     }
     
     public  int getId(){
       return id;
     }

   public String getDate(){
     return date;
      }

   public void setDate(String date){
     this.date = date;
  }

  public void setBalance(double balance){
       if(balance>0){
         this.balance = balance;
      }
  }

        public void setAnnualInterestRate(double annualInterestRate ){

             this.annualInterestRate = annualInterestRate;
              }
        
       public double getAnnualInterestRate(){
              return annualInterestRate;
          }

     public void deposit(double depositAmount){
       if(depositAmount>0.0){
           this.balance = balance + depositAmount;
        }
       if(depositAmount==0){
             this.balance = balance;
        }
    }
     public void withdrawal(double withdrawAmount){
           if(withdrawAmount>balance){
           System.out.print("Withdrawal Amount Exceed Account Balance\n");
          }
             if(withdrawAmount<=balance){
                   System.out.print("Withdraw Successful\n");
                 this.balance = balance - withdrawAmount; 

            }
     }
    

        public double getBalance(){
            return balance ; 
        }

       
            public double getMonthlyInterestRate(){
                double monthlyInterestRate = (getAnnualInterestRate()/1200.0);
                    return monthlyInterestRate;
             }


          public double getMonthlyInterest(){
                double monthlyInterest =(getMonthlyInterestRate()*balance);
                    return monthlyInterest;
             }

}