package basic.exam06.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class java01 {
	public static void main(String[] args) throws Exception{
		//1.드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. DB커넥션 객체 가져오기
       Connection con = DriverManager.getConnection(
    		   "jdbc:mysql://192.168.200.5:3306/studydb","study","study");
       
    	System.out.println("연결!");
    	
    	con.close();
       
       
    }

}
