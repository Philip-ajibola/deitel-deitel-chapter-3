import java.util.Scanner;

public class HealthRecordsTest{
     public static void main(String[] args){
        HealthRecords records= new HealthRecords(); 
         Scanner input = new Scanner(System.in);

      System.out.print("Enter Your First Name: ");
             String firstName = input.next();
               records.setFirstName(firstName);

         System.out.print("Enter Your Last Name: ");
             String lastName = input.next();
               records.setLastName(lastName);
          
        System.out.print("Enter Your Year of Birth: ");
             int yearOfBirth = input.nextInt();
               records.setYearOfBirth(yearOfBirth);

        System.out.print(" Your Gender: ");
             String gender = input.next();
               records.setGender(gender);


         System.out.print("Enter Your Height (in inches): ");
             double height = input.nextDouble();
               records.setHeight(height);

         System.out.print("Enter Your Weight(in kilogram): ");
             double weight  = input.nextDouble();
               records.setWeight(weight);
            
                System.out.printf("you are %dyears old %n",records.getAge());
                  records.getBMI();
                System.out.printf("Your gender: %s%n",records.getGender());
                System.out.printf("Your Maximum Heart Rate is: %d%n",records.getMaximumHeartRate());
                System.out.printf("Your Minimum Target Heart Rate Range is: %.2f%n",records.getMinTargetHeartRateRange());
                System.out.printf("Your Maximum Target Heart Rate Range is: %.2f%n", records.getMaxTargetHeartRateRange());




    }




}