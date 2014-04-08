package basic.exam06.episode.up1;

public class Collection3 extends SuCollection{
	class Box {
		Object value;
		Box next;
	}
	
	Box start;
	Box end;
	
	public Collection3() {
		start = new Box();
		end = start;
	}
	
	@Override
	public void add(Object obj) {
		end.value = obj;
		end.next = new Box();
		end = end.next;
		length++;
	}
	
	@Override
	public Object get(int index) {
		if (index >= 0 && index < length) {
			Box cursor = start;
			for (int pos = 0; pos < index; pos++) {
				cursor = cursor.next;
			}
			return cursor.value;
		} else {
			throw new RuntimeException("무효한 인덱스입니다.");
		}
	}
	@Override
	public void insert(int index, Object value) {
		if (index == 0) {
			Box next = start;
			start = new Box();
			start.value = value;
			start.next = next;
			
		} else if (index > 0 && index < length) {
			Box cursor = start;
			for(int pos = 1; pos < index; pos++) {
				cursor = cursor.next;
			}
			Box temp = new Box();
			temp.value = value;
			
			temp.next = cursor.next;
			cursor.next = temp;
			
		} else {
			throw new RuntimeException("인덱스가 무효합니다.");
		}
		length++;
	}
}

















