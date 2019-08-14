package edu.eci.arsw.math;

/**
 * PiThread
 */
public class PiThread extends Thread{
    private int start, count;
    private byte[] digitsOfTheThread;

    /**
     * Constructor
     * 
     * @param start
     * @param count
     */
    public PiThread(int start, int count) {
        this.start = start;
        this.count = count;
    }

    public byte[] getDigitsOfTheThread() {
        return digitsOfTheThread;
    }

    private void setDigitsOfTheThread(byte[] digitsOfTheThread) {
        this.digitsOfTheThread = digitsOfTheThread;
    }

    @Override
    public void run() {
        this.setDigitsOfTheThread(PiDigits.getDigits(start, count));
    }
    
}