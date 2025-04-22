
package learnaccessmodifier.mobil;

public class Mobile {
    
    String type;
    boolean displayStatus;
    boolean buttonStatus;
   private int numberOfCamera;
   protected boolean tourchStatus;

    public Mobile() {
    }

    public Mobile(String type, boolean displayStatus, boolean buttonStatus, int numberOfCamera, boolean tourchStatus) {
        this.type = type;
        this.displayStatus = displayStatus;
        this.buttonStatus = buttonStatus;
        this.numberOfCamera = numberOfCamera;
        this.tourchStatus = tourchStatus;
    }
    
        
    
}
