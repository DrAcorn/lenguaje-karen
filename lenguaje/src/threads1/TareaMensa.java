/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-102
 * Primera forma de crear Threads heredando la
 * clase Thread
 */
public class TareaMensa extends Thread{

    @Override
    public void run() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("Soy un thread!!");
    }
    
}
