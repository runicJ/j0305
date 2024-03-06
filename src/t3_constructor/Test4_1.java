package t3_constructor;

public class Test4_1 {
	String model; // 필드로 먼저
	String color = "블랙";
	int speed;
	
	Test4_1(String model) {  // #1 // 생성자 만들때 같은 이름
		this.model = model;  // 외부에서 받은 model을 내부에서
		this.color = "흰색";
		this.speed = 250;
	}
	
	Test4_1(String model, String color) {  // #2
		this.model = model;
		this.color = color;
		this.speed = 250;
	}
	
	Test4_1(String model, String color, int speed) {  // #3
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
