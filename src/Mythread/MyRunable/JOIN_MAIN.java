package Mythread.MyRunable;

public class JOIN_MAIN {
    public static void main(String[] args) {
        Thread_JOIN thread_join = new Thread_JOIN();
        Thread thread = new Thread(thread_join);
        Thread thread1 = new Thread(thread_join);
        thread_join.setThread(thread,thread1);
        thread.setName("consumer");
        thread1.setName("make");
        thread.start();
    }
}
