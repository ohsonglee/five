package basic.exam04.step03;
import java.util.Scanner; 
/*
 * StudentScore 클래스 개선
 * - 콤마(,) 를 포함하는 문자열로부터 StudentScore인스턴스를 생성하기
 *  - static 메서드(클래스메서드)를 활용법 사용 
 *  
 */
public class StudentMgtSystem {
	private static Scanner scanner = new Scanner(System.in);
	
	private static String[] promotCommand(){
		System.out.println(">명령");
		String input = 	scanner.nextLine();
		return input.split(" ");
	}

	private static void executeAdd(String value){
		String input;
		
		StudentScore score = StudentScore.fromCSV(value);
		
		System.out.println("이름:" + score.name);
		System.out.println("국어:" + score.kor);
		System.out.println("영어:" + score.eng);
		System.out.println("수학:" + score.math);
		System.out.println("등록하시겠습니까?(y/n)");
		input = scanner.nextLine();
		if("y".equals(input.toLowerCase())){
			System.out.println("등록되었습니다.");
		}else{
			System.out.println("등록이 취소되었습니다.");
		}
	}
		

	public static void main(String[] args) {
		do{
		String[] values = promotCommand();
		executeAdd(values[1]);
		if("add".equals(values[0])){
				}else if("quit".equals(values[0])){
					break;
				}else{
					System.out.println("사용할 수 없는 명령어 입니다.");
				}
		}while(true);
				scanner.close();
	}
}
