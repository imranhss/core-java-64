package learncollection.TestQueue;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {

        Queue<Integer> numbers = new LinkedList<>();

//        numbers.offer(5);
//        numbers.offer(6);
//        numbers.offer(50);
//        numbers.offer(500);
        System.out.println(numbers);

        try {
            numbers.remove();
            System.out.println(numbers);
        } catch (Exception parvez) {
            System.out.println(parvez);
        }

        numbers.poll();
        System.out.println(numbers);
        
        
        

    }

}
