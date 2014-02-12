/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;

/**
 *
 * @author Sietse
 */
public class Class_Thread extends Thread {

    private int count;// Holds the counter

    public Class_Thread(String name, int count) {
        super(name);// Calls the constructor of Thread, with param name.
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {// Loops for the amount asked for in count.
            System.out.println("Thread " + this.getName() + " | " + (i + 1));// Prints info.
            try {
                Thread.sleep(100);// Sleeps the thread for 100 ms.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}