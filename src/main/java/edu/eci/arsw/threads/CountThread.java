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
public class CountThread extends Thread{

    private int a;
    private int b;

    /**
     * Constructor
     */
    public CountThread(int ini, int end){
        this.a=ini;
        this.b=end;
    }

    @Override
    public void run() {
        for(int i = a; i<=b; i++){
            System.out.println(i);
        }
    }
    
}
