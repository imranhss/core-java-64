
package learnaccessmodifier.buttonphone;

import learnaccessmodifier.mobil.Mobile;


public class ButtonPhone extends Mobile{
    
    
    protected String radio;

    public ButtonPhone(String radio) {
        this.radio = radio;
    }

    public ButtonPhone(String radio, String type, boolean displayStatus, boolean buttonStatus, int numberOfCamera, boolean tourchStatus) {
        super(type, displayStatus, buttonStatus, numberOfCamera, tourchStatus);
        this.radio = radio;
    }

    public ButtonPhone() {
    }
    
    
    public void print(){
          
      
    
    }

    
    
    
    
    
    
    
    
}
