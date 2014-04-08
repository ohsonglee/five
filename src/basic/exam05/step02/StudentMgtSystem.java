package basic.exam05.step02;

/* 각 기능 별로 Control 클래스 분리
 *  - 사용자가 입력한 데이터를 가공하여 Dao에게 전달.
 * - Dao가 기턴한 데이터를 강공하여 Boundary에게 전달
 * - 일단, 현재 Control 이 Dao와 Boundary 역할을 겸한다.
 * 
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentMgtSystem {
	 static Scanner scanner = new Scanner(System.in);

	private static String promptmenu() {
		System.out.print("메뉴 >");
		return scanner.nextLine(); 
	}
	
	public static void main(String[] args) {
		do {
			String menu = promptmenu();

			if ("1".equals(menu)) {
				//StudentSoreControl.execute();
			} else if ("2".equals(menu)) {
				StudentSoreControl.execute();
			} else if ("list".equals(menu)) {
				System.out.println("1. 학생관리");
				System.out.println("2. 점수관리");
				System.out.println("q 종료*");
			} else if ("q".equals(menu)) {
				break;
			} else {
				System.out.println("없는 메뉴입니다.");
			}

		} while(true);

		scanner.close();
	}



}













