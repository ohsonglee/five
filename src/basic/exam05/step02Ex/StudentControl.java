package basic.exam05.step02Ex;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentControl {
static Scanner scanner;

static{
	scanner = StudentMgtSystem.scanner;
}
public static ArrayList<Student> studeInfo = 
															new ArrayList<Student>();


private static void executeStAdd(final String value) {
	String input;

	Student info = Student.fromCSV(value);

	System.out.println("이름 :" + info.name);
	System.out.println("나이 :" + info.age);
	System.out.println("전화번호 :" + info.tel);
	System.out.println("주소 :" + info.address);
	System.out.println("이메일 :" + info.email);

	System.out.print("등록하시겠습니까?(y/n)");
	input = scanner.nextLine();
	if ("y".equals(input.toLowerCase())) {
		studeInfo.add(info);
		System.out.println("등록되었습니다.");
	} else {
		System.out.println("등록 취소하였습니다.");
	}
}

public static void executeStList() {
	int i = 0;

	for (Student info : studeInfo) {
		System.out.println(i++ + " " +info); 

	}
}
private static void executeStDelete(final int no) {
	if(no >=0 && no < studeInfo.size()){
		studeInfo.remove(no);
		System.out.println("삭제하였습니다.");
	}else{
		System.out.println("유효하지 않은 번호입니다.");
	}
}
private static void executeStUpdate(final int no) {
	if(no >=0 && no < studeInfo.size()){
		Student info = studeInfo.get(no);
		System.out.print("이름 (" +info.name + "):");
		String input = scanner.nextLine();
		Student temp = new Student(input);

		System.out.print("나이 (" +info.age + "):");
		input = scanner.nextLine();
		temp.age = Integer.parseInt(input);

		System.out.print("전화번호 (" +info.tel + "):");
		input = scanner.nextLine();
		temp.tel = input;

		System.out.print("주소 (" +info.address + "):");
		input = scanner.nextLine();
		temp.address = input;
		
		System.out.print("이메일 (" +info.email + "):");
		input = scanner.nextLine();
		temp.email = input;

		System.out.print("변경하시겠습니까?(y/n)");
		input = scanner.nextLine();
		if ("y".equals(input.toLowerCase())) {
			studeInfo.set(no, temp);
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("변경 취소하였습니다.");
		}
	}else{
		System.out.println("유효하지 않은 번호입니다.");
	}
}

private static void executeStSave() {
	try{
		FileWriter out = new FileWriter("studentInfo.data");
		for(Student info : studeInfo){
			out.write(info.toString() + "\n"); 
		}
		out.close();
		System.out.println("저장되었습니다.");
	}catch(Exception ex){ 
		ex.printStackTrace(); 
	}
}

private static void executeStLoad() {
	try{
		FileReader in = new FileReader("studentInfo.data"); 
		Scanner s = new Scanner(in); 
		while(true) {
			try{
				studeInfo.add(Student.fromCSV(s.nextLine())); 
			}catch(NoSuchElementException ex) { 
				break;
			}
		}
		s.close();  
		in.close();
		System.out.println("로딩되었습니다.");
	}catch(Exception ex){ 
		ex.printStackTrace(); 
	}
}


	public static void execute() {
	do {
		String[] values = promptCommand();

		if ("add".equals(values[0])) {
			executeStAdd(values[1]);
		} else if ("list".equals(values[0])) {
		    executeStList();
		} else if ("delete".equals(values[0])) {
			executeStDelete((Integer.parseInt(values[1])));
		} else if ("update".equals(values[0])) {
			executeStUpdate((Integer.parseInt(values[1])));
		} else if ("save".equals(values[0])) {
			executeStSave();
		} else if ("load".equals(values[0])) {
			executeStLoad();
		} else if ("menu".equals(values[0])) {
			break;
		} else if ("quit".equals(values[0])) {
			System.out.println("종료되었습니다.  ");
			break;
		} else {
			System.out.println("사용할 수 없는 명령어입니다.");
		}

	} while(true);
}
	private static String[] promptCommand() {
		System.out.print("학생관리 >");
		 String input = scanner.nextLine();
		 return input.split(" ");
	}
}
