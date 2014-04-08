package basic.exam04.step06;

import java.util.ArrayList;

public class Episode01 {
	public static void main(String[] args) {
	    
		//ArrayList의 사용
		ArrayList<String> list = new ArrayLIst<String>();
		list.add("홍길동");
		list.add("장국영");
		list.add("임꺽정");
		list.add("장국영");
		
		for(String name: list){
			System.out.println(name);
		}
	}
}
