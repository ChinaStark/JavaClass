package Question.Qinterface;

public class impl1 implements interf1{

    class Inner{
        static final int i = 90;
        public static void fun2(){
            System.out.println("fun2");
        }
    }

    @Override
    public void fun() {

    }

    public static void fun1(){
        System.out.println("static");
    }


//
//    @Override
//    public void fun() {
////        j = 10;
////        System.out.println(j);
//    }
}
