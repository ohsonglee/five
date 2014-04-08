package basic.exam06.episode2;


	
public class ExTest02 {
		/*
		 * 예외를 보고하는 방법
		 * - throw [Throwable 객체 ];
		 * - 예외를 보고하는 메서드는 반드시
		 *   메서드 선언부에 어떤 예외흫 보고하는지 작성해야 함.
		 *   문법 : 메서드명() throws 예외클래스명, 예외클래스명...{}
		 *  java.lang.throwable
		 *       -> java.lang.Exception (메서드 선언부에 예외 클래스 선언)
		 *       : 애플리케이션 예외
		 *       -> java.lang.Error (메서드 선언부에 예외클래스 선언할 필요 없음)
		 *       : 시스템 예외
		 *       
		 */
	static class MyObject {
		public void m() throws Throwable {
			//예외 상황이 발생했다고 가정!
			throw new Throwable("오류발생!");
		}
		
		public void m2() throws Throwable { // 오류를 던질때는 선언부에 받을 객체를 선언해줘야함.
			throw new Exception("오호라...에러!!");  //<-Throwable의 자식
		}
		
		//Error 계열 또는 RuntimeException 계열의 예외객체는 메서드 선언부에 예외를 선언할 필요가 없다.
		//물론, 선언해도 상관없다.
		//RuntimeException 은 Exception 의 자식이다. (내 놓은 자식이다.)
		public void m3() /*throws Throwable*/ {
			throw new Error("오류발생!");  //<-Throwable의 자식
		}
		
		public void m4() /*throws Throwable*/ {
			throw new RuntimeException("실행중에 발생되는 오류!");  //<-Throwable의 자식
		}
		public void test1()/*throws Throwable*/{
			test2();
		}
		public void test2()/*throws Throwable*/{
			test3();
		}
		public void test3()/*throws Throwable*/{
		//	m2(); //m2()는 Exception을 던지기 떄문에 무조건 호출자에게 보고하거나
						// try ...catch블록을 처리해야한다.
			
			m4(); // RuntimeException은 굳이 보고할 필요가 없다. 자동 보고!
		}
		
	}
	
	public static void main00(String[] args) throws Throwable{ //자기가 직접처리
	    MyObject obj = new MyObject();
	 /*
	  * Error나 RuntimeException은 JVM에게 도착하기 전에만 처리하면 된다.
	  */
		try {
			obj.test1();
        } catch (Exception e) {
        	//JVM에 전달하지 않고 마지막 단계에서 처리. 
        }			
					
}
	
	
	public static void main(String[] args) throws Throwable{ //자기가 직접처리
	    MyObject obj = new MyObject();
	 /*
	  * m() , m2() 메서드는 Throwable, Exception 예외를 던지기 때문에 
	  * 반드시 try....catch를 사용해야 한다. 
	  *  => 프로그래밍을 하다 보면 메서드 -> 메서드 -> 메서드 -> 메서드" 이렇게 여러 단계에
	  *  		걸쳐 메서드를 호출 할 수 있다. 
	  *  		메서드를 호출할 떄 마다, try ...catch 블록을 써야하거나,
	  *  		또는 메서드 선언부에 예외클래스를 선언해야 한다면 무척 피곤할 것이다. 
	  *  		이런 경우 좀 더 가볍게 프로그래밍을 할 수 있도록 RuntimeException을 제공한다.
	  */
					obj.m();  	//Error
					obj.m2();   //RuntimeException
					  
}
	
	public static void main04(String[] args) throws Throwable{ //자기가 직접처리
	    MyObject obj = new MyObject();
	    //try 블럭에서 부모, 자식 관계를 갖는 예외가 던져진다면,
	    //각각의 예외에 대해 catch 블록을 여러개 선언할 수 있다.
	    //단, 자식 예외부터 받는 순서로 catch 블록을 만든다.

	    try {
					obj.m();  //Throwable
					obj.m2();   //Exception
	    		} catch (Exception e)  {
	    			System.out.println("1" + e.getMessage());

	    		} catch (Throwable e) {
	    			System.out.println("2" + e.getMessage());
				}
					  
}
	public static void main03(String[] args) throws Throwable{ //자기가 직접처리
	    MyObject obj = new MyObject();

	    try {
					obj.m();  //Throwable
					obj.m2();   //Exception
	    		} catch (Throwable e) {
	    			//try 블럭에서 부모, 자식 관계를 갖는 예외가 던져질 수 었다면
	    			//부모 참조변수로 받으면 된다.
	    			System.out.println(e.getMessage());
				}
					  
}
	public static void main02(String[] args){ //자기가 직접처리
	    MyObject obj = new MyObject();
	    /*
	     * 예외를 처리하는 방법
	     * try...chach 블록을 사용한다.
	     *  - 업무처리 코드와 예외 처리 코드를 분리 할 수 있다.
	     *    => 코드 가독성이 좋아진다.
	     */
				try {
					obj.m();  
				} catch (Throwable e) {
					
				}
					  
}

	public static void main01(String[] args) throws Throwable{ //받기 싫으면 보고한다.
	    MyObject obj = new MyObject();
	    
	    /*
	     * Throwable 이나 Excetion 계열(자식들)의 예외를 던지는 메서드를 호출 할 때는
	     * 반드시 try .. catch로 예외를 받아야한다. 
	     * 예외를 받기 싫으면 다시 호출자에게 넘긴다.
	     */
	   
	    obj.m();  
    }
}
