package t8_static;

public class T2_staticBlock {
	int field1;
	static int field2;
	
	void method1() {}  // 인스턴트 메소드
	static void method2() {}  // 정적 메소드
	
	// 정적블록
	static {
		field2 = 200;
		method2();
		
		// field1 = 100; // 정적 블록은 정적만 올 수 있음.
		// method1();
	}
}
