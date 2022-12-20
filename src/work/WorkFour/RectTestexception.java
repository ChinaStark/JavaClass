package work.WorkFour;
//是否能构成三角形
public class RectTestexception extends Exception {
    String message = "数字不能为负数";
    public RectTestexception(){}

    @Override
    public String getMessage() {
        return message;
    }
}
