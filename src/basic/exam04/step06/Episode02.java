package basic.exam04.step06;

import java.util.ArrayList;
import java.util.HashSet;

public class Episode02 {
	public static void main(String[] args) {
	    
		//HashSet의 사용
		// - 데이터가 중복되지 않는다.
		HashSet<String> list = new HashSet<String>();
		list.add("홍길동");
		list.add("장국영");
		list.add("임꺽정");
		list.add("장국영");
		
		for(String name: list){
			System.out.println(name);
		}
	}
}
