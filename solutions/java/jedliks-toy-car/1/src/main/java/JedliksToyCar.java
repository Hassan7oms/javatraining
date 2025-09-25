public class JedliksToyCar {
    static int count;
    int meters;
    int battery=100;
    public static JedliksToyCar buy() {
      count++;
        JedliksToyCar car = new  JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven "+meters+" meters";
    }

    public String batteryDisplay() {
        if(battery ==0){
             return "Battery empty";
        }else{
             return "Battery at "+battery+"%"; 
        }
        
    }

    public void drive() {
        if(battery>0){
            meters = meters+20;
            battery=battery-1;
        }
        
    }
}
