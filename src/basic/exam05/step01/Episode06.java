package basic.exam05.step01;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 *  BufferedInputStream / BufferedOuputStream
 *   - 파일을 읽을 때 1바이트 씩 읽는 것보다 왕창 읽는 것이 더 빠르다. 
 *   - 파일 읽기 시간 = data seek time + dasta transfer time
 *      => data seek time : HDD 헤더가 움직여 데이터가 있는 트랙으로 이동한 후 
 *      									트랙이 돌 때 섹터를 찾는 것 까지의 시간. 
 *      예 ) 1byte 읽는데 걸리는 시간 = data seek time (예) 0.0085초 )
 *       																+data transfer time (예) 0.000000003초)
 */

public class Episode06 {
	
	public static void main(String[] args) throws Exception {
		//BufferedInputStream 사용 +buf 사용
	FileInputStream in = new FileInputStream("/home/bit23/a.gz");
	BufferedInputStream in2 = new BufferedInputStream(in);

	byte[] buf = new byte[1024]; //보통 버퍼의 크기를 1024~8192 정도로 설정.
	int count = 0; //읽어들인 바이트수
	int len = 0;
	long startTime = System.currentTimeMillis();
	while((len = in.read(buf)) != -1) {
		if((++count %1000) == 0 ) {
			System.out.print(". ");
			count = 0;
		}
	}
	long duration = System.currentTimeMillis() - startTime;
	System.out.println("\n 경과된 시간(밀리초) = " + duration);
	
	
	in.close();
	
}
	
	public static void main04(String[] args) throws Exception {
		//BufferedInputStream 사용
	FileInputStream in = new FileInputStream("/home/bit23/a.gz");
	BufferedInputStream in2 = new BufferedInputStream(in);

	int b;
	int count =0;
	long startTime = System.currentTimeMillis();
	while((b = in.read()) != -1) {
		if((++count %1000000) == 0 ) {
			System.out.print(". ");
			count = 0;
		}
	}
	long duration = System.currentTimeMillis() - startTime;
	System.out.println("\n 경과된 시간(밀리초) = " + duration);
	
	
	in.close();
	
}
	
	
	public static void main02(String[] args) throws Exception {
			//8192 바이트씩 데이터 읽기
		FileInputStream in = new FileInputStream("/home/bit23/a.gz");
	
		byte[] buf = new byte[8192]; //보통 버퍼의 크기를 1024~8192 정도로 설정.
		int count = 0;
		int len = 0;
		long startTime = System.currentTimeMillis();
		while((len = in.read(buf)) != -1) {
			if((++count %100) == 0 ) {
				System.out.print(". ");
				count = 0;
		}
		}
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("\n 경과된 시간(밀리초) = " + duration);
		
		
		in.close();
		
		
		
	}
	
	public static void main01(String[] args) throws Exception {
		//1바이트씩 데이터 읽기
		FileInputStream in = new FileInputStream("/home/bit23/a.gz");
		
		int count = 0;
		int b;
		
		long startTime = System.currentTimeMillis();
		while((b = in.read()) != -1) {
			if((++count %1000000) == 0 ) {
				System.out.print(". ");
				count = 0;
			}
		}
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("경과된 시간(밀리초) = " + duration);
		
		
		in.close();
		
	}
	
	
	public static void main00(String[] args) throws Exception {

			//데이터 출력
			FileOutputStream out = new FileOutputStream("student3.dat");
			DataOutputStream out2 = new DataOutputStream(out);
			
			String name = "홍길동";
			int kor = 90, eng = 100, math = 80 , sum=270;

			out2.writeUTF(name);
			out2.writeInt(kor);  
			out2.writeInt(eng);  
			out2.writeInt(math);
			out2.writeInt(sum);  
			
			out2.close();
			out.close();
	}
	

	
	
}
