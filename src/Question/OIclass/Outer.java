package Question.OIclass;

interface  Noaname{
    abstract void speak();
}
public class Outer {

    public int k = 1000;
    //成员内部类，可以访问外部类的所有成员
    class Demo{
        public static int i =10;
        public int j = 100;
    }
    static void fun(Noaname no1){
        no1.speak();
    }



    public static void main(String[] args) {
//        Outer outer = new Outer();
        System.out.println(Outer.Demo.i);
        fun(()->{
            System.out.println("kjkkl");
        });
    }

}