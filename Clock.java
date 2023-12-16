public class Clock{
  private int hour;
  private int minutes;
  private int seconds;

  public Clock(int hour, int minutes, int seconds){
     if(hour>=0 && hour<=23){
            this.hour = hour;
           }
      if(minutes>=0 && minutes<=59){
       this.minutes = minutes;
         }
       if(seconds>=0 && seconds<=59){
         this.seconds = seconds;
       }


}

   public int getHour(){
     return hour;
   }
   public void setHour(int hour){
    if(hour>=0 && hour<=23){
            this.hour = hour;
      }
             if(hour<0 && hour>23){
              this.hour= 00;
           }

    }
        public int getMinutes(){
             return minutes;
        }

        public void setMinutes(int minutes){
           if(minutes>0 && minutes<=23){
              this.minutes = minutes;
           }
             if(minutes<0 && minutes>23) {
              this.minutes= 00;
           }

        }
         public int getSeconds(){
           return seconds;
         }

         public void setSeconds(int seconds){
           if(seconds>0 && seconds<=23){
            this.seconds = seconds;
           }
             if(seconds<0 && seconds>23){
              this.seconds= 00;
           }
     
         }
    public void displayTime(){
       System.out.printf("%d:%d:%d",getHour(),getMinutes(),getSeconds());  
    }
           
}