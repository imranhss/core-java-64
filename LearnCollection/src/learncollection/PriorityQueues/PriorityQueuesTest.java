package learncollection.PriorityQueues;

import java.util.PriorityQueue;

public class PriorityQueuesTest {

    public static void main(String[] args) {

        PriorityQueue<Double> prices = new PriorityQueue<>();

        prices.offer(5.50);
        prices.offer(20.50);
        prices.offer(20.50);
        prices.offer(30.50);
        prices.offer(10.50);
        prices.offer(90.50);

        System.out.println(prices);

        prices.remove();

        System.out.println(prices);

    }

}
