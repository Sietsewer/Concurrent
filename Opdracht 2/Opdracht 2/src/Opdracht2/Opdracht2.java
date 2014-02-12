/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;

/**
 *
 * @author Sietse
 */
public class Opdracht2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread aT = new Class_Thread("a", 5);
        Thread bT = new Class_Thread("b", 5);
        Thread cT = new Class_Thread("c", 5);
        aT.start();
        bT.start();
        cT.start();

        // Adds a divider in System.out
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // End of divider code.

        System.out.println(" -- METHOD 2 --");
        Runnable aR = new Class_Runnable("a", 5);
        Thread aRt = new Thread(aR);
        Runnable bR = new Class_Runnable("b", 5);
        Thread bRt = new Thread(bR);
        Runnable cR = new Class_Runnable("c", 5);
        Thread cRt = new Thread(cR);
        aRt.start();
        bRt.start();
        cRt.start();


    }
}
