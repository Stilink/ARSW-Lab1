/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread countThread0to99 = new CountThread(0,99);
        CountThread countThread99to199 = new CountThread(99,199);
        CountThread countThread200to299 = new CountThread(200,299);
        countThread0to99.start();
        countThread99to199.start();
        countThread200to299.start();
                
    }
    
}
