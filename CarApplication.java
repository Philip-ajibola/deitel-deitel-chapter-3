public class CarApplication{
   public static void main(String[] args){

      Car myCar1 = new Car("Lexus 350","2023",40000000,7); 
      Car myCar2 = new Car("Lexus 350","2023",40000000,5); 

   System.out.printf("The  First Car Model is %s%n",myCar1.getModel());
     System.out.printf("%s Model %n",myCar1.getYear());
       System.out.printf("Initail Price %.2f%n",myCar1.getPrice());
        System.out.printf("Discount on car is %.2f  %n",myCar1.getDiscount());
          System.out.printf("The Discount Price is %.2f%n",myCar1.getCarPrice());    

     System.out.printf("The Second Car Model is %s%n",myCar2.getModel());
      System.out.printf("%s Model%n",myCar2.getYear());
       System.out.printf("Initial Price %.2f%n",myCar2.getPrice());
        System.out.printf("Discount  on car is %.2f %n",myCar2.getDiscount());
                   System.out.printf("The Discount Price is %.2f%n",myCar2.getCarPrice());    

    

}




}