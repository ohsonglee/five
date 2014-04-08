package basic.exam05.step01;

public class inner {
	class InstanceInner{} //인스턴스클래스
	static class outerInner{} //스태틱클래스
	InstanceInner iv = new InstanceInner();  //인스턴스 멤버간에는 직접 접근이 가능
	static outerInner cv = new outerInner(); //스태틱 멤버간에는 직접 접근이 가능.
	
	static void methodinner(){
		//InstanceInner obj = new InstanceInner(); //스태틱멤버는 인스턴스에 직접 접근할 수 없다.  
		outerInner obj2 = new outerInner(); 
		
		inner outer = new inner();
		InstanceInner obj3 = outer.new InstanceInner();
		
		
	}
	/*
	
	static class outerInner{
		int iv = 0;
		static int cv = 0;
		static final int bv = 0; // final이 붙은 변수는 상수이기 때문에 어떤 경우라도 static을 붙이는게 가능하다.
	}
	class memberinner{
		int iv2 = 0;
		//static int cv2 = 0;  // 멤버메소드에는 스태틱변수를 사용할 수 없다. 
		static final int bv2 = 0;   // final이 붙은 변수는 상수이기 때문에 어떤 경우라도 static을 붙이는게 가능하다.
	}

	void methodinner(){
		class mrthodinner{
			int iv3= 0;
			//static int cv3 = 0; //지역클래스에는 스태틱변수를 사용할 수 없다. 
			static final int bv3 = 0;   // final이 붙은 변수는 상수이기 때문에 어떤 경우라도 static을 붙이는게 가능하다.
			
		}
	}
	
	*/
	
	
}
