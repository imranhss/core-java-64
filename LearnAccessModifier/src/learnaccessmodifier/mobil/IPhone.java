
package learnaccessmodifier.mobil;


public class IPhone extends Mobile{
    
    String operatingSystem;
    String store;

    public IPhone() {
    }

    public IPhone(String operatingSystem, String store) {
        this.operatingSystem = operatingSystem;
        this.store = store;
    }

    public IPhone(String operatingSystem, String store, String type, boolean displayStatus, boolean buttonStatus, int numberOfCamera, boolean tourchStatus) {
        super(type, displayStatus, buttonStatus, numberOfCamera, tourchStatus);
        this.operatingSystem = operatingSystem;
        this.store = store;
    }

    

    
    
    
    
    
    
}
