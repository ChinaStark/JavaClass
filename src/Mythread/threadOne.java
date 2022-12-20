package Mythread;
public class threadOne{
    public static void main(String[] args) {
        SpeakElephant speakElephant;
        SpeakCar speakCar;
        speakElephant = new SpeakElephant("da");
        speakCar = new SpeakCar("car");
        speakCar.start();
        speakElephant.start();
        for (int i = 1;i<15;i++){
            System.out.println("master"+i+" ");
        }
    }
}

class SpeakElephant extends Thread{
    SpeakElephant(String str){
        super(str);
    }
    public void run(){
        for (int i = 1;i<=20;i++){
            System.out.println("大象"+i+"");
        }
    }
}

class SpeakCar extends Thread {
    SpeakCar(String str){
        super(str);
    }
    public void run(){
        for (int i = 1; i < 20; i++) {
            System.out.println("轿车"+ i + "");
        }
    }

}