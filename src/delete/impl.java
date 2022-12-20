package delete;

class impl11 implements Emp{
    int p;

    @Override
    public void charge() {
        System.out.println("charge");
    }
}
public class impl {
    public static void main(String[] args) {
        Emp emp1;
        emp1 = ()->{
            System.out.println("i impl it method");
        };
        emp1.charge();
//        emp1 = new impl11();
        emp1.charge();
        Emp.key();
        System.out.println(impl11 .MINSALARY);
    }
}
