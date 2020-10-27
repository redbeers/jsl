package student;
// 1 이학생 28 90 89 80
class StuData extends Student{
	int kor;
	int eng; 
	int mat;
	
	StuData(int bun, String name, int ege, int kor, int eng, int mat){
		super (bun, name, ege);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	@Override
	public void StudentPrint() {
		
		super.StudentPrint();
		System.out.print(kor+"\t");
		System.out.print(eng+"\t"); 
		System.out.print(mat+"\t");
		System.out.print((kor+eng+mat)+"\t");
		double k = (kor+eng+mat)/3;
		System.out.println(k);
		
	}

}
