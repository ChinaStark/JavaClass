package delete;

public interface Emp {
    static int MINSALARY = 30;
    public abstract void charge();
    private void getSalary(){
        System.out.println(MINSALARY);
    }
    public static void key() {
        System.out.println("key");
    }

    public default void setMinSalary() {

    }
}
