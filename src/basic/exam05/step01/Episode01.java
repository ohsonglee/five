package basic.exam05.step01;

/*
 * 1. package member class
 *  - 일반 클래스 
 * 2. inner class 
 *  - 클래스 안에 선언된 클래스
 * - top level inner class : staitc 으로 선언된 inner 클래스
 * - member inner class
 * 
 */

// package member class
class MyClass {
	
	// top level inner class 
	static class MyInnerClass {}
	
	// member inner class
	class MyInnerClass2 {}
	
	public void m() {
		// local inner class
		// - 메서드 안에서만 사용가능하다. 
		class MyInnerClass3 {}
		MyInnerClass3 p = new MyInnerClass3();
	}
	public void m2() {
		// 일반 용도의 클래스 선언
		class Student /*extends Object*/ {
    	String name;
    	int age;
    }
		Student s1 = new Student();
		Student s2 = new Student();
		
    // anonymous inner class (익명클랙스)
	// - 한번 밖에 사용하지 않을 클래스라면 익명 중첩 클래스로 선언한다.
    // - 익명 중첩 클래스는 클래스 정의와 동시에 인스턴스를 생성해야한다.
    // - new [슈퍼클래스 또는 인터페이스이름]() { . . . }
	// - 생성자는 수퍼클래스의 생성자를 지정해야한다. 
		Object p = new Object() {  //new로 즉시 만들어줘야한다. 이름이 없는 클래스는 찾을 수 없기 때문에.
	    	String name;
	    	int age;
		};
		Object p2 = new Object() {
	    	String title;
	    	int price;
	    	int qty;
		};
	}
}
public class Episode01 {
	
	public static void main(String[] args) {
		//member inner 클래스 의 사용
		// - 특정 클래스 안에서 인스턴스 메서드들이 사용하는 클래스라면 멤버로 선언
		// - 바깥쪽에서 사용할 일은 없다.(그 클래스 내부에서만 사용)
		// - 다만 억지로 다른 클래스에서 멤버중첩클래스를 사용하고 싶다면 다음과 같이.
		// - 거의 사용하지 않음.
		MyClass outer = new MyClass();
		MyClass.MyInnerClass2 inner = outer.new MyInnerClass2();
		
	}
		
	public static void main01(String[] args) {
		//top level inner 클래스 의 사용
		// - 바깥 클래스 이름으로 직접 접근 가능
		// - 바깥 클래스는 일종의 패키지처럼 간주됨
		// - 클래스의 크기가 작은 클래스들을 여러개 만들때 사용한다.
		// - 안드로이드에서 상수값을 다룰때 이 방식을 사용.
		
		MyClass.MyInnerClass p = new MyClass.MyInnerClass();

	}

}
