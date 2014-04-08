package basic.exam05.ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentScoreControl {
	static Scanner scanner;
	public ArrayList<StudentScore> scoreList  =
				new ArrayList<StudentScore> ();
	
	public void add(StudentScore score){
		scoreList.add(score);
	}
	public void update(int no, StudentScore s){
		scoreList.set(no, s);
	}
	public void remove(int no){
		scoreList.remove(no);
	}
	public void load(){
		try {
	        FileReader in = new FileReader("ss.data");
	        Scanner scanner = new Scanner(in);
	        while(true){
	        	try {
	        		scoreList.add(StudentScore.fromCSV(scanner.nextLine()));
                } catch (NoSuchElementException e) {
                	break;
                }
	        }
	        in.close();
        } catch (Exception e) {
	        e.printStackTrace();
        }
		
	}
	public void save(){
		try {
	        FileWriter out = new FileWriter("ss.data");
	        for(StudentScore score : scoreList){
	        	out.write(score.toString()+"/n");
	        }
	        out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		scanner.close();
	}
}














