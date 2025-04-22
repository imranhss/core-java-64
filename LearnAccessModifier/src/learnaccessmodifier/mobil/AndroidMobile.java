
package learnaccessmodifier.mobil;

import learnaccessmodifier.buttonphone.ButtonPhone;


public class AndroidMobile {
    
    Mobile m=new Mobile();
    
    ButtonPhone bp=new ButtonPhone();
    
      
    
    
    String operatingSystem;
    String store;

    public AndroidMobile() {
    }

    public AndroidMobile(String operatingSystem, String store) {
        this.operatingSystem = operatingSystem;
        this.store = store;
    }
    
    
    
    
    public void printDetails(){
        
        m.type="Smart Phone";
        m.buttonStatus=false;
         
       
        
        System.out.println("operatingSystem: "+operatingSystem+"\n"
                + "Store :"+ store
        +" Type: "+ m.type);
                
    }
    
    
    
}
