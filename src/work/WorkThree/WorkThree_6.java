package work.WorkThree;

public class WorkThree_6 {
    public static void main(String[] args) {
        float sum = 0;
        int n = 1;
        while (sum < 8888) {
            n++;
            sum = (float) ((1.0 + n) * n / 2);

        }
        System.out.println("the max number is : " + (n - 1));
    }
}
