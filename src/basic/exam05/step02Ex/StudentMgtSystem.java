package basic.exam05.step02Ex;
import java.util.Scanner;

public class StudentMgtSystem {
    static Scanner scanner = new Scanner(System.in);

	 static String promptmenu() {
		System.out.print("메뉴 >");
		 return scanner.nextLine().toLowerCase(); 
	}

	public static void main(String[] args) {
		do {
			String menu = promptmenu();

			if ("1".equals(menu)) {
				StudentControl.execute();
			} else if ("2".equals(menu)) {
				StudentScoreControl.execute();
			} else if ("list".equals(menu)) {
				System.out.println("1. 학생관리");
				System.out.println("2. 점수관리");
				System.out.println("q 종료");
			} else if ("q".equals(menu)) {
				System.out.println("종료되었습니다.  ");
				break;
			} else {
				System.out.println("사용할 수 없는 메뉴입니다.");
			}

		} while(true);

		scanner.close();
	}

}

