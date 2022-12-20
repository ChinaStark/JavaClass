package Mythread.MyRunable.Q1;

public class E {
    public static void main(String[] args) {
        Target target = new Target();
        Thread thread = new Thread(target);
        thread.run();

        for (int i = 0;i<3;i++){
            System.out.println("yes");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Target implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<3;i++){
            System.out.println("ok");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
