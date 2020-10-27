package COM.JSL;

import java.util.Date;

import COM.A;

public class B {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private Date birth;
	private A aa;
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {//값을 변경할때는 set
		this.bun = bun;
	}
	public String getName() {//값을 꺼내올때는 get
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public A getAa() {
		return aa;
	}
	public void setAa(A aa) {
		this.aa = aa;
	}
	
	
}
