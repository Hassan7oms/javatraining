
class BirdWatcher {
    private final int[] birdsPerDay;
    private int lastDay ;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int [] birdsLastWeek=new int[7];
        for(int i = 0 ; i <7 ; i++){
            birdsLastWeek[i]=birdsPerDay[i];
        }
        return birdsLastWeek;
    }

    public int getToday() {
        lastDay =(birdsPerDay.length) -1;
        return birdsPerDay[lastDay];
    }

    public void incrementTodaysCount() {
        lastDay =(birdsPerDay.length) -1;
        birdsPerDay[lastDay]=birdsPerDay[lastDay]+1;
        
    }

    public boolean hasDayWithoutBirds() {
        boolean zerobird=false;
        for(int birdPerday:birdsPerDay){
            if(birdPerday==0){
                zerobird=true;
            }
        }
        return zerobird;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        
        for (int i =0;(i<numberOfDays && i<birdsPerDay.length) ;i++){
          sum +=birdsPerDay[i];  
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDay=5;
        int counterForBusyDays=0;
        for(int birdPerday:birdsPerDay){
            if(birdPerday>=busyDay){
                counterForBusyDays++;
            }
        }
        return counterForBusyDays;
    }
}
