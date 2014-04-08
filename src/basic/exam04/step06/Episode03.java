package basic.exam04.step06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Episode03 {
	
	public static void main(String[] args) {
		//HashMap 의 키를 Mykey로 교체
		// hashCode 와 equals() 
		class Mykey {
			int keyNo; 
			
		public Mykey(int no){
				keyNo = no; //인스턴스 변수이름과 로컬변수 이름이 충돌되지 않을때 생략가능. 
			}
			
		}
		
		Mykey k1 = new Mykey(100);

		HashMap<Mykey,String> map = new HashMap<Mykey, String>();
		map.put(k1, "홍길동");
	
		Mykey k2 = new Mykey(100);
	
				if(k1 == k2) System.out.println("인스턴스같다.....");
				if(k1.equals(k2)) System.out.println("equals...");
				if(k1.hashCode() == k2.hashCode()) System.out.println("hash....");
				
				
	System.out.println( map.get(k1));
	// 비록 내용은 같지만, hashCode()와 equals() 를 재정의 하지 않았다. 
	System.out.println( map.get(k2)); //null 리턴

	
	//값 목록만 꺼낼 수 있다. 
	for(String name : map.values()){ //map.valuse() 값목록!
		System.out.println(name);
		}
	//키 목록만 꺼낼 수 있다. 
	for(String name : map.keySet()){ //map.keySet() 키목록!
		System.out.println(name);
		}
	}
	
	
	public static void main06(String[] args) {
		//HashMap 의 키를 Integer로 교체
	  //인티져 클래스의 인스턴스를 키로 쓰겠다. > 인티져 인스턴스를 키로 쓰겠다. > 인티져를 키로 쓰겠다. 
	HashMap<Integer,String> map = new HashMap<Integer, String>();
	map.put(new Integer(100), "홍길동");
	map.put(200, "장국영"); //AutoBoxing
	map.put(300, "임꺽정");
	map.put(400, "홍길동");
	
	map.put(400, "오호라"); //기존 값을 덮어씀
	
	System.out.println( map.get(100));
	System.out.println( map.get(200));
	System.out.println( map.get(300));
	System.out.println( map.get(400));
	
	//값 목록만 꺼낼 수 있다. 
	for(String name : map.values()){ //map.valuse() 값목록!
		System.out.println(name);
		}
	//키 목록만 꺼낼 수 있다. 
	for(String name : map.keySet()){ //map.keySet() 키목록!
		System.out.println(name);
		}
	}
	
	public static void main05(String[] args) {
		//HashMap 사용
		//  - 데이터를 저장할 때 키 객체가 필요함
		//  - 데이터를 꺼낼 때도 키 객체가 필요함
		//  - 값이 중복 저장되는 것은 허용하나, 
		//  - 키가 중복되는 것은 허용하지 않는다. 
	HashMap<String,String> map = new HashMap<String, String>();
	map.put("100", "홍길동");
	map.put("200", "장국영");
	map.put("300", "임꺽정");
	map.put("400", "홍길동");
	
	map.put("400", "오호라"); //기존 값을 덮어씀
	
	
	System.out.println( map.get("100"));
	System.out.println( map.get("200"));
	System.out.println( map.get("300"));
	System.out.println( map.get("400"));
	
	//값 목록만 꺼낼 수 있다. 
	for(String name : map.values()){ //map.valuse() 값목록!
		System.out.println(name);
		}
	//키 목록만 꺼낼 수 있다. 
	for(String name : map.keySet()){ //map.keySet() 키목록!
		System.out.println(name);
		}
	}
	
	public static void main04(String[] args) {
		// local inner class 
	    class Student {
	    String name;
	    int age;
	    public Student(String n , int a){
	    	//로컬변수 이름과 충돌나지 않는다면 this 생략가능.
	    	/*this.*/name = n;
	    	this.age = a;  // 파라미터 이름과 동일 => this 생략불가능
	    }
	}
	    
	    
		//HashSet의 사용
		// - 데이터가 중복되지 않는다. 
	    // - 꺼낼 때 순서를 따지지 않는다. 
	    // - 값을 보관할 때 인스턴스의 해시값으로 라벨을 붙인다. 
		HashSet<Student> list = new HashSet<Student>();
		list.add(new Student("홍길동",18));
		list.add(new Student("장국영",60));
		list.add(new Student("임꺽정",32));
		list.add(new Student("장국영",60));
		
		for(Student name: list){
			System.out.println(name);
		}
	}
	public static void main03(String[] args) {
		// local inner class 
	    class Student {
	    String name;
	    int age;
	    public Student(String n , int a){
	    	//로컬변수 이름과 충돌나지 않는다면 this 생략가능.
	    	/*this.*/name = n;
	    	this.age = a;  // 파라미터 이름과 동일 => this 생략불가능
	    }
	}
	    
	    
	    Student s1 = new Student("홍길동",18);
	    Student s2 = new Student("장국영",60);
	    Student s3 = new Student("임꺽정",32);
	    Student s4 = new Student("장국영",60);

	    
	    
		//HashSet의 사용
		// - 데이터가 중복되지 않는다. 
	    //   => instance가 달라도 해시값과 equals() 결과가 같다면 닽은 데이터로 취급
	    //   => 중복하여 저장되지 않는다. 
	    // - 꺼낼 때 순서를 따지지 않는다. 
	    // - 값을 보관할 때 인스턴스의 해시값으로 라벨을 붙인다. 
		HashSet<Student> list = new HashSet<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(Student name: list){
			System.out.println(name);
		}
	}




	public static void main02(String[] args) {
		// local inner class 
	    class Student {
	    String name;
	    int age;
	    public Student(String n , int a){
	    	//로컬변수 이름과 충돌나지 않는다면 this 생략가능.
	    	/*this.*/name = n;
	    	this.age = a;  // 파라미터 이름과 동일 => this 생략불가능
	    }
	}
	    
	    
		//HashSet의 사용
		// - 데이터가 중복되지 않는다. 
	    // - 꺼낼 때 순서를 따지지 않는다. 
	    // - 값을 보관할 때 인스턴스의 해시값으로 라벨을 붙인다. 
		HashSet<Student> list = new HashSet<Student>();
		list.add(new Student("홍길동",18));
		list.add(new Student("장국영",60));
		list.add(new Student("임꺽정",32));
		list.add(new Student("장국영",60));
		
		for(Student name: list){
			System.out.println(name);
		}
	}


}
