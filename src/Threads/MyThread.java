package Threads;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Kartik's thread...");
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
    }
}
