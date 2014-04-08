package basic.exam06.episode.up4;

/*
 * 추상클래스!
 */
public abstract class AbstractCollection implements Collection {
	int length;

	public int size() {
		return length;
	}
}


//추상메서드 : 하위클래스에서 강제적으로 반드시 구현하도록 하고 싶을 때 사용함.
//출상 클래스 : 하위클래스에게 공통 속성 및 기능을 상속해 주는 용도로 사용하는 것.