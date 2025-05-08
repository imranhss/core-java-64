
package taskthreaddemo;


public class TaskThreadDemo {

 
    public static void main(String[] args) {
        
        Runnable a=new PrintChar('A', 100);
        Runnable b=new PrintChar('B', 100);
        Runnable c=new PrintNum(100);
        
        
        Thread a1=new Thread(a);
        Thread b1=new Thread(b);
        Thread c1=new Thread(c);
        
        c1.start();
        a1.start();
        
        b1.start();
        
        
        
    }
    
}
