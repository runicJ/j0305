package t3_constructor;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t3_1 = new Test3();  // Test3에서 기본생성자가 없으면 오류남
		Test3 t3_2 = new Test3(100);  // ctrl+space 자동으로 타입 들어감
		// new 하면 다른 저장소
		System.out.println("t3_1.atom : " + t3_1.atom);
		System.out.println("t3_2.atom : " + t3_2.atom);
	
		t3_1.atom = 500;  // 1. 필드의 값을 직접 바꿈(웹에서 해킹, 보안에 문제가 있을 수 있음(로컬x))
		System.out.println("t3_1.atom : " + t3_1.atom);
		System.out.println("t3_2.atom : " + t3_2.atom);
	
		t3_2.atom = 600;
		System.out.println("t3_1.atom : " + t3_1.atom);
		System.out.println("t3_2.atom : " + t3_2.atom);		
		System.out.println();
		
		Test3 t3_3 = new Test3(10, 20);  // 2. 생성자는 객체를 생성할 때 초기값을 줌
		System.out.println("t3_3.atom : " + t3_3.atom);
		System.out.println("t3_3.atom : " + t3_3.atom2);
		System.out.println();
	
		t3_3.atom = -100;
		t3_3.atom2 = -200;
		System.out.println("t3_3.atom : " + t3_3.atom);
		System.out.println("t3_3.atom : " + t3_3.atom2);		
		System.out.println();
	
		Test3 t3_4 = new Test3(70, 3.14);
		System.out.println("t3_4.atom : " + t3_4.atom);
		System.out.println("t3_4.atom3 : " + t3_4.atom3);		
	}
}
