package work.WorkThree;

public class WorkThree_5{
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1;i<=10;i++){
            double a = 0;
            for (int j = 0;j<i;j++){
                a+=8*Math.pow(10,j);
            }
            sum+=a;
        }
        System.out.println(sum);
    }
}
