package Test;

public class demoThree{
    public static void main(String[] args) {
        double i = 1.0;
        double sum = 0.0f;
//        while (i<=100){
//            sum+=Math.pow(-1,i+1)*(float)(1/i);
//            i++;
//        }

//        do {
//            sum+=Math.pow(-1,i+1)*(float)(1/i);
//            i++;
//        }while (i<=100);
        for(double j = 1 ;j<=100;j++){
            sum+=Math.pow(-1,j+1)*(float)(1/j);
        }

        System.out.println(sum);
    }
}
