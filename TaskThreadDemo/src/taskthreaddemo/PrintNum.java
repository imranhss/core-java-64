/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskthreaddemo;

/**
 *
 * @author Admin
 */
public class PrintNum implements Runnable {

    private int lastNum;

    public PrintNum() {
    }

    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {

        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }

    }

}
