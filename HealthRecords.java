public class HealthRecords{
   private String firstName;
   private String lastName;
   private String gender;
   private int yearOfBirth;
   private double height;
   private double weight;

public HealthRecords(){
   this.firstName = firstName;
   this.lastName = lastName;
   this.gender = gender;
   this.yearOfBirth = yearOfBirth;
   this.height = height;
   this.weight = weight;

}

   public void setFirstName(String firstName){
       this.firstName = firstName; 
   }
   public String getFirstName(String firstName){
     return firstName;
   }
   public void setLastName(String lastName){
      this.lastName = lastName;
  }
   public String getLastName(){
       return lastName;
  }
   public void setGender(String gender){
       this.gender = gender;
  }
   public String getGender(){
       return gender;
   }
   public void setYearOfBirth(int yearOfBirth){
      this.yearOfBirth = yearOfBirth;
   }
   public int getYearOfBirth(){
        return yearOfBirth;
   }
   public void setHeight(double height){
        this.height= height;
  }
   public double getHeight(){
      return height;
   }
   public void setWeight(double weight){
      this.weight = weight;
   }
   public double getWeight(){
    return weight;   
   }
    
    public int getAge(){
        int currentYear = 2023;
	int age = currentYear-getYearOfBirth();
        return age;
    }
   public void getBMI(){
     double  BMI = getWeight()/(getHeight()*getHeight());
       System.out.printf("Your BMI %.2f %n",BMI);
   }

   public int getMaximumHeartRate(){
       int maximumHeartRate = 220 - getAge();

        return maximumHeartRate;
   }

    public double getMinTargetHeartRateRange(){
      double minTargetHeartRateRange = (50.0/100) * getMaximumHeartRate();
        return minTargetHeartRateRange;
    }

   public double getMaxTargetHeartRateRange(){
      double maxTargetHeartRateRange = (85.0/100) * getMaximumHeartRate();
         return maxTargetHeartRateRange;

}



}