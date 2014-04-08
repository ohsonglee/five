package basic.exam06.episode.Ex;

public class Collection {
	public class Box{
		Object value;
		Box next;
	}
	
	int length;
	Box start;
	Box end;
	
	public Collection() {
		start = new Box();
		end = start;
	}
	
	public void add(Object value){
		end.value=value;
		end.next = new Box();
		end = end.next;
		length++;
	}
	
	public Object get(int index){
		if(index>=0 && index<length){
			Box cursor = start;
			for(int pos=0; pos<index;pos++){
				cursor = cursor.next;
			}
			return cursor.value;
		}else{
			throw new RuntimeException();
		}
	}
	
	public int size(){
		return length;
	}
	
	public void insert(int index, Object value){
		if(index==0){
			Box next = start;
			start = new Box();
			start.value=value;
			start.next = next;
		}else if(index>0 && index<length){
			Box cursor=start;
			for(int pos=1; pos<index;pos++){
					cursor = cursor.next;
			}
			Box temp =  new Box();
			temp.value = value;
			
			temp.next = cursor.next;
			cursor.next = temp;
		}else{
			throw new RuntimeException();
		}
		length++;
	}
}
