import java.text.MessageFormat;

public class Exam_04_원하는시간베열출력 {

	public static void main(String[] args) {
		String id = "akak";
		String name = "sdfag";
		String tel = "129-9656-7899";
		String message = "ID: "+id+" 이름"+name+"전화 :"+tel;
		System.out.println(message);
		String message1 = "ID: {0} 이름 : {1} 전화 : {2}";
		String result = MessageFormat.format(message1, id, name, tel);
		System.out.println(result);
		
		String[] mem = {"ID"," sdfag ","129-9656-7899"};
		System.out.println(mem[0]+mem[1]+mem[2]);

	}

}
