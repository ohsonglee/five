package basic.exam06.episode2;

import java.io.FileReader;

/*
 * 	예외처리란?
 * 	- 시스템 실행하는 중에 오류가 발생했을 떄 시스쳄을 멈추지 않고 적절한 조치 후에
 * 	  계속 실행하게 만드는 문법
 * 	- 목적 : 예외 상황 발생시 시스템을 멈추지 않게 하는것.
 * 	
 * 
 * 
 */
class MyObject{
	//	 1. 작은 오류는 보고하지 말고 처리할 것.
	//   - 화장실 변기 똥 묻었음.
	public void 청소하라1(){
		try {
	        // 예외발생: 변기게 또 묻다.
        } catch (Throwable e) {
        	//적절한 조치를 취한다.
        }
	}
	
	// 2. 중요한 오류 발생시 보고할 것
	//   - 화장실 변기 깨졌음.
	//   - 중요오류는 직접처리하지 말고 호출자에게 보고한다.
	public void 청소하라2() throws Throwable, Exception {
	//	try {
	        //중요예외발생 :변기깨짐.
    //    } catch (Throwable e) {
        	// 문방구에서 오공본드를 사서 한 조각씩 붙인다.
    //    }
	}
	
	// 중요한 예외 발생 . 보고하기 전에 처리 필요할 필요가 있음.
	// - 변기 휴지통 불남.
	public void 청소하라3()throws Throwable{
		try {
			// 변기 휴지통 불남.
        } catch (Throwable e) {
        	// 일단 오류 상황 처리
        	// 호출자에게 오류내용 보고
        	throw new Throwable("오류내용...");
        }
		
	}
}

public class ExTest01 {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		//호출하는 메서드가 오류 던진다고 선언되어 있으면
		//반드시 try ... catch문을 사용해서 호출해야 한다.를
		try {
			obj.청소하라3();  //치명적인 오류 발생. 내부적으로 처리한 후 보고한다.
        } catch (Throwable e) {
        	//예외에 대해 추가 조치를 한다.
        }
		
	}

	
	public static void main02(String[] args) {
		MyObject obj = new MyObject();
		//호출하는 메서드가 오류 던진다고 선언되어 있으면
		//반드시 try ... catch문을 사용해서 호출해야 한다.를
		try {
			obj.청소하라2();  //예외가 발행하면 즉시 호출자에게 보고한다.
        } catch (Throwable e) {
        	  //중요한 예외는 호출자가 처리한다.
        }
		
	}

	public static void main01(String[] args) {
		MyObject obj = new MyObject();
		obj.청소하라1(); //청소하라1() 에서 오류가 발생하더라도 호출자는 모른다.
									// 호출자가  알필요도 없는 것은 보고할 필요도 없다.
		
	}

}
