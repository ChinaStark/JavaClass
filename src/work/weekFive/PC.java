package work.weekFive;

public class PC {
	private CPU cpu;
	private HardDisk HD;

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setHD(HardDisk hD) {
		HD = hD;
	}

	public void show() {
		System.out.println("cpu is :" + cpu.getSpeed());
		System.out.println("HardDisk is :" + HD.getAmount());
	}
	
}
