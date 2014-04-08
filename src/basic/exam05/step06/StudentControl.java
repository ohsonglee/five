package basic.exam05.step06;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentControl {
	static Scanner scanner;
	public  ArrayList<Student> studentList 
												= new ArrayList<Student>();

	public void add(final Student student) {
	studentList.add(student);
	}
	
	public void executeList() {
		int i = 0;
		for (Student student : studentList) {
			System.out.println(i++ + " " + student);
		}
	}
	
	public void remove(final int no) {
	  if (no >= 0 && no < studentList.size()) {
	  	studentList.remove(no);
	  	System.out.println("삭제하였습니다.");
	  } else {
	  	System.out.println("유효하지 않은 번호입니다.");
	  }
  }
	
	public void update(final int no, final Student s) {
	studentList.set(no, s);
  }
	
	public void save() {
		try {
			FileWriter out = new FileWriter("student.data");
			for(Student student : studentList) {
				out.write(student.toString() + "\n");
			}
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void load() {
		try {
			FileReader in = new FileReader("student.data");
			Scanner s = new Scanner(in);
			while(true) {
				try {
					studentList.add(Student.fromCSV(s.nextLine()));
				} catch (NoSuchElementException ex) {
					break;
				}
			}
			s.close();
			in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	

}














