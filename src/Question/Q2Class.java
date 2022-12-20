package Question;

import Pojo.Student;

public class Q2Class {
    public static void main(String[] args) {
        Student student = new Student();
//        int a1 = student.a;
        aClass aclass = new aClass();
        aClass.speak();
        bClass bclass = new bClass();
//        bclass.getNum();
        bClass.speak();
        System.out.println(aclass.g(101));
    }
}

class bb extends Student{

    void way(){
        System.out.println(a);
    }
}

abstract class a {
    int a = 10;
    final void f(){
        System.out.println("fA");
    }
    void fun2(){
        System.out.println("fun2A");
    }
    abstract void fun();
}
class aClass{
//     static {
//        System.out.println("aClass");
//    }
//    aClass(int m){
//        System.out.println("aClass");
//    }
     static  void speak(){
         System.out.println("stupid");
    }
    static int g(int n){
         return n*n;
    }
     public float getNum(){
         return 3.0f;
     }
}
class bClass extends aClass{

     static void speak(){
        System.out.println("bClass");
    }
}
class B extends a {
//    void fun2(){
//        System.out.println("fun2B");
//    }

    int a = 100;
    @Override
    void fun() {
        System.out.println(("I'm A"));
    }
}
