package basic.exam05.step02Ex;

public class Student {
	String name;
	int age;
	String tel;
	String address;
	String email;
	
	public Student(String name) {
	    this.name = name;
    }

	
	
	@Override
    public String toString() {
	    return name + "," + age + "," + tel + "," + address + "," + email ;
    }



	public static Student fromCSV(String value) {
		String[] data = value.split(",");
		
		Student obj = new Student(data[0]); 
		obj.age = Integer.parseInt(data[1]);
		obj.tel = data[2];
		obj.address = data[3];
		obj.email =data[4];
		return obj;
    }



}
