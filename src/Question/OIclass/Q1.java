package Question.OIclass;
class fun{
    int p = 0;
}
public class Q1 {
    Inner inner;
    Q1(){
        inner = new Inner();
    }
    class Inner{
        Inner(){
            a = new fun();
        }
        static int op = 10;
        fun a;
    }
}
