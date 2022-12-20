package Mythread.MyRunable;


class Cake{
    public String nameOfCake;

    public Cake(String nameOfCake, int price) {
        this.nameOfCake = nameOfCake;
        this.price = price;
    }

    public int price;
}

public class Thread_JOIN implements Runnable{
    Cake cake;
    Thread maker,consumer;
    public void setThread(Thread consumer,Thread maker){
        this.consumer = consumer;
        this.maker = maker;
    }
    @Override
    public void run() {
        if(Thread.currentThread() == consumer){
            System.out.println(consumer.getName()+"等待"+ maker.getName()+"制作蛋糕");
            maker.start();

            try{
                Thread.sleep(2000);
                maker.interrupt();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(consumer.getName()+" Buy "+ cake.nameOfCake+" price is: "+cake.price);
        }
        if(Thread.currentThread() == maker){
            System.out.println(maker.getName()+" was make a cake...");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("this cake isn't done");
            }
            cake = new Cake("birthday",158);
            System.out.println(maker.getName()+" is done");
            System.out.println(consumer.getName()+" Buy "+ cake.nameOfCake+" price is: "+cake.price);
        }
    }
}
