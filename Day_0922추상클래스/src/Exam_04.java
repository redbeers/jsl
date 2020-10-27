abstract class Student{
	int bun;
	String name;
	int [] score;
	int tot;
	double ave;
	public Student(int bun, String name, int[] score) {
		this.bun=bun;
		this.name=name;
		this.score=score;
	}
	public void print() {
		System.out.println("번호\t이름\t총점\t 평균");
		System.out.println(bun+"\t"+name+"\t"+tot+"\t"+ave);
	}
	public abstract void account();//총점 평균 계산
	public abstract void scoreMex();//최소점수: xxx최대점수 xxx
	public abstract void scoreSelectionSort();//점수(오름차수): ㅇㅇ ㅇㅇ ㅇㅇ ㅇㅇ
	public abstract void scoreBubbleSort();//점수 (내림차순) : ㅁㅁ ㅁㅁ ㅁㅁ 
	
}
class StudentExam extends Student{
	public StudentExam(int bun, String name, int[] scorre) {
		super(bun,name,scorre);
	}
	@Override
	public void account() {
		
		
		for(int i=0; i<score.length; i++) {
			tot +=score[i];
		}
		ave=tot/score.length;

	}
	@Override
	public void scoreMex() {
		
		int m=100;
		int s=1;
		
		for(int i=0; i<score.length; i++) {
			if(m>score[i]) {
				m=score[i];
			}
			if(s<=score[i]) {
				s=score[i];
			}
		}
		System.out.print("최소점수 :"+m+" ");
		System.out.println("최고점수 :"+s);
		
	}
	
	@Override
	public void scoreSelectionSort() {
		int a=0;
		
		for(int i=0; i < score.length; i++) {
			for(int x=0; x<score.length -i -1; x++) {
				if(score[x]>score[x+1]) {
					a=score[x];
					score[x]=score[x+1];
					score[x+1]=a;
			}
			}
			System.out.print(score[i]+" ");
		}
		System.out.println();
		
		
	}
	@Override
	public void scoreBubbleSort() {
		
		int o=0;
		for(int i=0; i < score.length; i++) {
			for(int x=0; x<score.length -i -1; x++) {
				if(score[x]<score[x+1]) {
					o=score[x];
					score[x]=score[x+1];
					score[x+1]=o;
			}
			}
			System.out.print(score[i]+" ");
		}
		
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		int bun = 1101;
		String name = "Java";
		int[] score= {40,90,78,78,56,84,94,64,86,65,95};
		StudentExam stu=new StudentExam(bun,name,score);
		stu.account();
		stu.print();
		stu.scoreMex();
		stu.scoreSelectionSort();
		stu.scoreBubbleSort();
		
	}

}
