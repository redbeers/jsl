
public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int ror;
	int tot;
	double ave;
	String by;
	
	Student(){}
	Student(int bum, String name, int kor, int eng, int mat){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.mat=mat;
		totAve();
		by();
	}
	void totAve() {
		tot=kor+eng+mat;
		ave=tot/3.;
	}
}
