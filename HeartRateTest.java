import java.util.Scanner;

public class HeartRateTest{
   public static void main(String[] args){
           HeartRate heart = new HeartRate();
      Scanner scr = new Scanner(System.in);
         System.out.print("Enter Your First Name: ");
               String theFirstName = scr.nextLine();
               heart.setFirstName(theFirstName);

            System.out.print("Enter Your Second Name: ");
               String theSecondName = scr.nextLine();
                heart.setLastName(theSecondName);

          
           System.out.print("Enter Your Year Of Birth: ");
             int year = scr.nextInt();
             heart.setYearOfBirth(year);
         
                         
               
          System.out.printf("You Are %d Years Old Now %n ",heart.getAge());
           System.out.printf("Your Maximum Heart Rate is %d%n",heart.getMaximumHeartRate());
           System.out.printf("Your  Maximum Target Heart-Rate Range is %.2f and the Minimum Target Heart-Rate Range  %.2f%n ",heart.getMaxTargetHeartRateRange(),heart.getMinTargetHeartRateRange());
             







    }




}