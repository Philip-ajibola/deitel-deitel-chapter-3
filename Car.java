public class Car{
   private String model;
   private String year;
    private double price;
    private double discount;

  public Car(String model,String year,double price,double discount){
    this.model = model;
    this.year = year;
    this.price = price;
    this.discount = discount;
  }
     public void setModel(String name){
         this.model = model;
     }
     public String getModel(){
         return model;
     }
      public void setYear(String year){
            this.year = year;
     }
     public String getYear(){
         return year;
    }
    public void setPrice(double price){
          this.price = price;
    }
     public double getPrice(){
       return price;
    }
      public void setDiscount(double discount){
           this.discount = discount;
     }
     public double getDiscount(){
        return discount;
     }
 
     public double getCarPrice(){
      return price = price*(1-(discount/100));

}



}






