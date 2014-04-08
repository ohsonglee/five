package javapro;

class Car {
String color;
String gearType;
int door;
	
{System.out.println("Car인스턴스가 생성되었습니다.");}
	Car() {
		color = "white";
		gearType = "Auto";
	}

	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door
				+ "]";
	}

	



}

