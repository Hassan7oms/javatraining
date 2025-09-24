public class CarsAssemble {
    private int baseNum = 221;
    public double productionRatePerHour(int speed) {
        if (speed <5){
            return (double)(speed * 221);    
        }else if (speed >4 && speed <9){
            return (double)(speed * 221 *90)/100;
        }else if (speed ==9){
            return (double)(speed * 221 *80)/100;
        }else if (speed == 10){
            return (double)(speed * 221 *77)/100;
        }
        else {
            return 100;
        }
        
    }

    public int workingItemsPerMinute(int speed) {
        if (speed <5){
            return (int)(speed * 221)/60;    
        }else if (speed >4 && speed <9){
            return (int)(speed * 221 *90)/6000;
        }else if (speed ==9){
            return (int)(speed * 221 *80)/6000;
        }else if (speed == 10){
            return (int)(speed * 221 *77)/6000;
        }
        else {
            return 100;
        }
    }
}
