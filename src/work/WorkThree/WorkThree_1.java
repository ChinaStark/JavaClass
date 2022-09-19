package work.WorkThree;

public class WorkThree_1 {
    public static void main(String[] args) {
        double sum  = 0;
        for (int i = 1; i<= Integer.parseInt(args[0]);i++){
            double a =  1;
            for (int j = 1; j <= i; j++) {
                a *= j;
            }
            sum+=a;
        }
        System.out.printf("%.0f",sum);
    }
}
