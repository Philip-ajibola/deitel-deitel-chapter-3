public class HeartRate{
  private String firstName;
  private String lastName;
  private int yearOfBirth;

    public HeartRate(){
     this.firstName = firstName;
     this.lastName = lastName;
     this.yearOfBirth = yearOfBirth;


     }

    public String getFirstName(){
       return firstName;
    }
    public void setFirstName(String firstName){
     this.firstName = firstName;
    }
  
    public String getLastName(){
       return lastName;
    }
    public void setLastName(String lastName){
     this.lastName = lastName;
    }
    
     public int getYearOfBirth(){
        return  yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
       this.yearOfBirth = yearOfBirth;
    }
     
     public int getAge(){
        int currentYear = 2023;
	int age = currentYear-getYearOfBirth();
        return age;
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