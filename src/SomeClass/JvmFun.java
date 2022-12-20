package SomeClass;

public class JvmFun {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long l = runtime.freeMemory();
        System.out.println(l);
    }
}
