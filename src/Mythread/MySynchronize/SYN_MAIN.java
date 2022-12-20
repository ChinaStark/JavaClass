package Mythread.MySynchronize;

public class SYN_MAIN {
    public static void main(String[] args) {
        SynOne synOne = new SynOne();
        Thread thread = new Thread(synOne);
        Thread thread1 = new Thread(synOne);
        thread1.setName("t1");
        thread.setName("t2");
        thread1.start();
        thread.start();
    }
}
