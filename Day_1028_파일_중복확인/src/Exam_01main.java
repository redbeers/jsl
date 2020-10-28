import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
/* - 입력 번호 이름 점수(3)
 * - 0입력시 종료
 * - 동인조건시 "이미 등록된 번호입니다."
 * 
 * 출력
 * 번호  이름  국어  영어  수학  총점  평균  학점
 * 						 00.00
 * 
 * 학점
 * 평균 90A, 80B, 70C, 60D, 60이하F
 * 
 * 1입력 -> 학생등록
 * 2입력 -> 전체 출력
 * 3입력 -> 종료
 */
class Student implements Serializable, Comparable<Student>{
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double ave;
	private char hak;

	public Student() {
	}

	public Student(int bun, String name, int kor, int eng, int mat) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor+eng+mat;
		ave = Math.round(sum * 100. / 3) / 100.;
		check((int)ave);
	}

	public void check(int ave) {
		
		switch (ave/10) {
		case 10:
		case 9:
			setHak('A');
			break;
		case 8:
			setHak('B');
			break;
		case 7:
			setHak('C');
			break;
		case 6:
			setHak('D');
			break;
		default:
			setHak('F');
			break;
		}
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(bun, o.bun);
	}

	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + ave + "\t" + hak;
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

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAve() {
		return ave;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	public char getHak() {
		return hak;
	}

	public void setHak(char hak) {
		this.hak = hak;
	}

	
}
public class Exam_01main {
	static Scanner sc = new Scanner(System.in);

	public static void add(TreeSet set) {
		
		System.out.println("번호,이름,국어,영어,수학 점수입력");
		StringTokenizer st;
		st = new StringTokenizer(sc.nextLine().trim(), " ,.-");
		int cnt = st.countTokens();
		int num[] = new int[4];
		String str[] = new String[cnt];
		
		try {
		while (st.hasMoreTokens()) {
			for (int i = 0; i < cnt; i++) {
				str[i] = st.nextToken();
			}
			for (int i = 0; i < cnt-1; i++) {
				if (i > 0) {
					num[i] = Integer.parseInt(str[i+1]);
				} else {
					num[i] = Integer.parseInt(str[i]);
				}
			}
		}
		
		boolean bool = false;
		bool = set.add(new Student(num[0], str[1], num[1], num[2], num[3]));
		if(!bool) {
			System.out.println("이미 등록된 번호입니다.");
		}
		
		}catch(NumberFormatException e) {
			System.out.println("잘못된 입력입니다.");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("잘못된 입력입니다.");
		}
		
		

	}

	public static void print(TreeSet set) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		Iterator<Student> iter = set.iterator();
		int sum[] = new int[3];
		double ave[] = new double[3];
		int cnt = 0;
		
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s);
			sum[0] += s.getKor();
			sum[1] += s.getEng();
			sum[2] += s.getMat();
			cnt++;
		}
		
		for (int i = 0; i < ave.length; i++) {
			ave[i] = Math.round(sum[i] * 100. / cnt) / 100.;
		}
		System.out.println("총점\t\t" + sum[0] + "\t" + sum[1] + "\t" + sum[2]);
		System.out.println("평균\t\t" + ave[0] + "\t" + ave[1] + "\t" + ave[2]);
	}

	public static void exit(TreeSet set) {
		try {
			File f = new File("/Users/uneko/data/student.dat");
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(set);
			oos.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.exit(0);
		}
	}

	private static FileOutputStream FileOutputStream(File f) {
		return null;
	}

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Programming\\JSL\\JAVA\\Date\\student.dat");
			Object obj = null;
			TreeSet<Student> set;
			
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int ok = bis.available();
			
			if (ok != 0) {
				ObjectInputStream ois = new ObjectInputStream(bis);
				obj = ois.readObject();
				set = (TreeSet<Student>) obj;
			} else {
				set = new TreeSet<Student>();
			}

			while (true) {
				System.out.print("(1~3)선택 :");
				int num = 0;
				try {
					num = sc.nextInt();
				} catch (InputMismatchException e) {

				}
				sc.nextLine();
				switch (num) {
				case 1:
					add(set);
					break;
				case 2:
					print(set);
					break;
				case 3:
					exit(set);
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;

				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}