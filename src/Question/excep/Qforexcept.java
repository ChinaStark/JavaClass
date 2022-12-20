package Question.excep;

public class Qforexcept {
    public static void main(String[] args) {
        int n = 0,m = 0,t = 1000;
        try {
            m = Integer.parseInt("8888");
            n = Integer.parseInt("888s");
            t = Integer.parseInt("9123");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println(t);
        }
    }
}
