/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;

/**
 *
 * @author Sietse
 */
public class Class_Runnable implements Runnable {

    private String name;
    private int count;// Holds the counter

    public Class_Runnable(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {// Loops for the amount asked for in count.
            System.out.println("Thread " + this.name + " | " + (i + 1));// Prints info.
            try {
                Thread.sleep(100);// Sleeps the thread for 100 ms.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}