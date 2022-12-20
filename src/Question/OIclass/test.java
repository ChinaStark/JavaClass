package Question.OIclass;

public class test {
//    public static void main(String[] args) {
//        Q1 q1 = new Q1();
//        q1.inner.a = new fun();
//        System.out.println(q1.inner.a.p);
//    }
    int x = 100;
    public test(){
        System.out.println("kk");
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        test test = new test();
        int[][] ints = new int[10][10];
//        System.out.println(ints);
        for (int []a:ints){
            for (int b:a){
                System.out.println(b);
            }
        }
    }

}
