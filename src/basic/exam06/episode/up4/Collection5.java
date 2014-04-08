package basic.exam06.episode.up4;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 *  Java 는 다중 상속을 지원하지 않는다. 
 *  - ArrayList 를 상속 받으면서 AbstractCollection을 상속 받을 수 없다!
 */
public class Collection5 extends ArrayList<Object> implements Collection {
	
	/*
	 * 문제발생!
	 * ArrayList로부터 상속받은 boolean add(Object value)와
	 * Collection 의 void add(Object value)의 시그너처가 같지 않다. 
	 *  => 컴파일 오류 발생
	 *      해결책 : Collection06참조 
	 */
	@Override
    public void insert(int index, Object value) {
    }
}
