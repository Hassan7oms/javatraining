class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery;

    public int getSpeed(){
        return speed;
    }
    public int getBatteryDrain(){
        return batteryDrain;
    }
    NeedForSpeed(int speed, int batteryDrain) {
      this.speed = speed;
      this.batteryDrain=batteryDrain;
        distance=0;
        battery=100;
    }

    public boolean batteryDrained() {
        if(battery<=0 ||(battery-batteryDrain)<0){
            return true;
        }
        else{
            return false;
        }
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        
        if(battery>0 && (battery-batteryDrain)>=0){
            distance=distance+speed;
            battery = battery-batteryDrain;
        }
        
    }

    public static NeedForSpeed nitro() {
          var car =new NeedForSpeed(50,4);
            return car;
        }
        
    
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        float carSpeed= car.getSpeed();
        float carBattery = car.getBatteryDrain();
        float reqBattery= (float)(distance/carSpeed) *carBattery;
        return reqBattery<=100;
    }
}
