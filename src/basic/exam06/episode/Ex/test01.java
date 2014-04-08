package basic.exam06.episode.Ex;

public class test01 {
		static Collection coll = new Collection();


	private static void testadd() {
	    coll.add("홍길");
    }

	private static void testList() {
		for(int i=0; i<coll.size(); i++){
			System.out.println(coll.get(i));
		}
	}
	
	
	public static void main(String[] args) {
	 try {
		 testadd();
    } catch (Exception e) {

    }
		try {
	        
			testList();
        } catch (Exception e) {
        	
        }
    }

}
