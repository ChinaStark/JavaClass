package Pojo;

public class Person {
    void speakHello(){
        System.out.println("你好 很高兴认识您");
        System.out.println("nice to meet you");
    }
}
class Xiti{
    public static void main(String[] args) {
        Person person = new Person();
        person.speakHello();
    }
}
