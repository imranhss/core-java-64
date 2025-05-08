package taskthreaddemo;

public class PrintChar implements Runnable {

    private char charToPrint; // The character to print
    private int times; // The number of times to repeat

    public PrintChar() {
    }

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }

    }

}
