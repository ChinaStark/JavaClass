package Mythread.MySynchronize;

import java.util.Objects;

public class SynOne implements Runnable{
    @Override
    public synchronized void run() {
        if(Objects.equals(Thread.currentThread().getName(), "t1")){

            for(int i = 0;i<3;i++){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if(Objects.equals(Thread.currentThread().getName(), "t2")){
            for(int i = 0;i<3;i++){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
