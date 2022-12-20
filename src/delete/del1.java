package delete;

class base {
    base(int i) {
        System.out.println("base");
    }

    static final int p = 100;
    public final int a = 10;

    public void printlnn() {
        System.out.println("println");
    }
}

class after extends base {


    public void printlnn() {

    }

    after(int i) {
        super(i);
    }
}

public class del1 {


    public static void main(String[] args) {
        after fter = new after(3);
        base base1 = new base(25);
        fter.printlnn();
        System.out.println(base1.p);
    }

}
