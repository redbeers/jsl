
public class StudentData {
	//sort 메소드 구현
	public void stuSort(Student[] student, int cnt) {
		for(int x=0; x<cnt-1; x++) {
			for(int y=x+1; y<cnt; y++) {
				if(student[x].bun >student[y].bun) {
					Student temp = student[x];
					student[x]=student[y];
					student[y]=temp;
				}
			}
		}
	}
}
