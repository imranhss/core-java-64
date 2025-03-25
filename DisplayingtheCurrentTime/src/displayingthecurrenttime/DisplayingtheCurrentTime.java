
package displayingthecurrenttime;


public class DisplayingtheCurrentTime {

    public static void main(String[] args) {
        
        long time=System.currentTimeMillis();
        System.out.println(time);
        
        long totalSeconds=time/1000;
        
        long hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        long remainingSeconds = totalSeconds % 3600; // Remaining seconds after extracting hours

        long minutes = remainingSeconds / 60; // 1 minute = 60 seconds
        long seconds = remainingSeconds % 60; // Remaining seconds after extracting minutes

        long currentHours=((hours+6) % 24);
        
        System.out.println( currentHours+ " hours, " + minutes + " minutes, " + seconds + " seconds BD");
        
        
        
        
    }
    
}
