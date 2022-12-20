package Question;

public class Q2Static {
    public static void main(String[] args) {
        System.out.println(A.num);
    }
}
//访问类中的static final 成员时,JVM会在编译阶段对类执行编译优化,当类中有static final修饰的基本数据类型和字符串类型时,就会在编译阶段执行初始化.
class A{  //final和static搭配使用效率更高,不会导致类加载,如果没有final,A类也会被加载,输出A代码块被执行
    public final static int num=100;
    static{
        System.out.println("A代码块被执行");
    }
}
abstract class AA{
    abstract float get();
    void aFun(){}
}
class BB extends AA{

    @Override
    public float get() {
        return 0;
    }
}