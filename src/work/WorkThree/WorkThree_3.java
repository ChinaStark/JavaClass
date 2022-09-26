package work.WorkThree;

public class WorkThree_3 {
    public static void main(String[] args) {

        int j = 1;
        double sum = 0.0;
        do {
            double a = 1;
            for (int i = 1; i <= j; i++) {
                a *= i;
            }
            sum += (1.0 / a);
            j++;
        } while (j <= 20);
        System.out.println(sum);
        new WorkThree_3().compete();


    }
    void compete(){
        System.out.println("hahaha");
    }
}
