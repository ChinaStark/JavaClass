package work.weekFive;

public class TestClock {

	/**
	 * @param args
	 */
//	7������һ��ʱ����Clock��������ʱ���֡�������ʾʱ�䣬�ڹ��췽���ж����Խ��г�ʼ����
//	��Ա����printTime������ʾʱ�Ӷ����ʱ�䡣��������TestClock���������main�����д������ʱ����Ķ���
//	�������Щ�����ʱ�䣬��ʽ���ա�8��30��0����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		c.setHour(8);
		c.setMinite(30);
		c.setSecend(0);
		c.printTime();
	}
	

}
class Clock {
	private int hour;
	private int minite;
	private int secend;
	public void printTime(){
		System.out.println(hour+ ":"+minite+":"+secend);
	}
	public void setMinite(int minite) {
		this.minite = minite;
	}
	public int getMinite() {
		return minite;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}
	public void setSecend(int secend) {
		this.secend = secend;
	}
	public int getSecend() {
		return secend;
	}
}