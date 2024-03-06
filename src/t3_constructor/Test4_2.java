package t3_constructor;

public class Test4_2 {
	String model;
	String color = "블랙";
	int speed;
	
	Test4_2(String model) {  // #1
		this(model, "흰색", 250);
	}
	//this. 현재클래스의 필드  //this() 현재 클래스의 생성자
	Test4_2(String model, String color) {  // #2
		this(model, color, 250);  // speed 값을 #3로 넣고 나머지는 #3에서 받을래 
		// string, string, int만 맞춰주면 됨. 값 지정 안할거면 기본값.
	}
	
	Test4_2(String model, String color, int speed) {  // #3
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
