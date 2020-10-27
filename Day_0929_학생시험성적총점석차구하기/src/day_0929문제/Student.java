package day_0929문제;

import java.util.Scanner;

public class Student {
	
	Scanner sc= new Scanner(System.in);
	int bun = sc.nextInt();
	String name = sc.next();
	int kor = sc.nextInt();
	int mat = sc.nextInt();
	int eng = sc.nextInt();
	int tot = kor+mat+eng;
	double ave = tot/3;
	int rank;

	public Student () {}
	public Student(int bun, String name, int kor, int mat, int eng, int tot, double ave) {
		
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.tot=tot;
		this.ave=ave;
	}
	public void Student() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println(bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t"+rank);
	}
	
}

