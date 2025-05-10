
package threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPools {

   
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(4);  
        
        for (int i = 1; i <= 10; i++) {
            Runnable task = new MyTask(i);
            executor.submit(task);
        }

        // Shut down the executor
        executor.shutdown();
    }
    
}
