package Question;
class bass{
    protected int i = 10;
}

class child extends bass{

}

public class Q3 extends child{
    public static void main(String[] args) {
        child child = new child();
//        int i = child.i;
        System.out.println(child.i);
    }

}
