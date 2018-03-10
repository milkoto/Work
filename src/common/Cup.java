package common;

public class Cup {
	private static int cup_nums=100;
	public  Cup() {}
	public void sells() {
		cup_nums--;
	}
	public int getNums() {
		return cup_nums;
	}
}
