package java.com.java.exam;

public class Su {

	private int bun;
	private String name;
	private int tot;
	private double ave;
	private int rank;
	
	public Su() {}
	public Su(int bun, String name, int tot) {
		this.bun=bun;
		this.name=name;
		this.tot=tot;
		this.ave=ave;
		this.rank=rank;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}

}
