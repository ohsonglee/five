package basic.exam05.step01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 *  Data Sink Stream Class
 *  - 데이처를 직접 타일이나 메모리 등으로 입 출력하는 클래스
 * 
 *  예 ) FileInputStream, FileOutputStream
 * - 바이너리 데이터의 입력 출력을 다루는 클래스
 */

public class Episode02 {
	
	public static void main(String[] args) throws Exception {
		//데이터 읽기 
		FileInputStream in = new FileInputStream("student2_2.dat");
		int len = 0;
		len |= in.read() << 24;
		len |= in.read() << 16;
		len |= in.read() << 8;
		len |= in.read();
		
		byte[] buf = new byte[len];
		in.read(buf);
		//다시 한글로 변환하려면 스트링 생성자로 아래 두가지 파라미터를 입력해주면 된다. String(byte[] bytes, Charset charset);
		String name = new String(buf, "UTF-8"); 
		System.out.println(name);
		
		int kor = 0;
		kor |= in.read() << 24;
		kor |= in.read() << 16;
		kor |= in.read() << 8;
		kor |= in.read();
		
		int eng = 0;
		eng |= in.read() << 24;
		eng |= in.read() << 16;
		eng |= in.read() << 8;
		eng |= in.read();
		
		int math = 0;
		math |= in.read() << 24;
		math |= in.read() << 16;
		math |= in.read() << 8;
		math |= in.read();
		
		int sum = 0;
		sum |= in.read() << 24;
		sum |= in.read() << 16;
		sum |= in.read() << 8;
		sum |= in.read();

		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(sum);
		
		in.close();
	}
	public static void main02(String[] args) throws Exception {
		//데이터 출력
		// - 문자열은 먼저 크기를 4바이트로 출력한다.
		//  =>- 그리고 문자열 바이트를 출력한다. 
		//-  숫자는 int의 4바이트 모두 출력한다.   
		FileOutputStream out = new FileOutputStream("student2_2.dat");
		
		String name = "홍길동";
		int kor = 90, eng = 100, math = 80 , sum=270;
		
		byte[] bytes = name.getBytes("UTF-8"); //해당 string 의 charset 인코딩 바이트 배열을 얻는다.
		System.out.println(bytes.length); // >>9를 리턴한다. utf-8 은 한글을 3바이트로 인식.
		int len = bytes.length; 
		System.out.println(len); 
		
		out.write(len >> 24); 
		out.write(len >>16); 
		out.write(len >> 8); 
		out.write(len); 
		
		out.write(bytes); 
		
		out.write(kor >> 24); 
		out.write(kor >>16); 
		out.write(kor >> 8); 
		out.write(kor); 
		
		out.write(eng >> 24); 
		out.write(eng >>16); 
		out.write(eng >> 8); 
		out.write(eng); 

		out.write(math >> 24); 
		out.write(math >>16); 
		out.write(math >> 8); 
		out.write(math); 
				
		out.write(sum >> 24); 
		out.write(sum >>16); 
		out.write(sum >> 8); 
		out.write(sum); 
		

		
		out.close();
	}
	
	
	public static void main01(String[] args) throws Exception {
		//데이터 출력
		FileOutputStream out = new FileOutputStream("student2.dat");
		
		String name = "홍길동";
		int kor = 90, eng = 100, math = 80 , sum=270;
		
		byte[] bytes = name.getBytes("UTF-8");
		System.out.println(bytes.length);

		
		out.write(name.getBytes("UTF-8")); //9byte 출력 => 문자열과 숫자사이에 경계가 없다.
		out.write(kor);   // 1byte 
		out.write(eng);  // 1byte 
		out.write(math);// 1byte 
		out.write(sum);  // 1byte  출력 => 270은 1byte 를 초과하므로 문제이다.
		
		
		out.close();
	}

}
