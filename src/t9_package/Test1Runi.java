package t9_package;

import t4_method.Calculator;  // 패키지 다르면 일단 import //java code style organize
import t4_method.Test2_1;
import t4_method.Test3_1;

//import t4_method.*;  // 패키지 안에 있는 모든 클래스 참조 // 상위 패키지명.*

public class Test1Runi {
	public static void main(String[] args) {
		Test1 t1 = new Test1();

		System.out.println("1.번호 : " + t1.getNo());
		System.out.println("1.성명 : " + t1.getName());

		t1.setNo(10);
		t1.setName("홍길동");

		System.out.println("2.번호 : " + t1.getNo());
		System.out.println("2.성명 : " + t1.getName());

		System.out.println("t8_static.T1의 PI : " + t8_static.T1.pi); // 접근제한자

		t7_instance.Test1 t7 = new t7_instance.Test1(); // 인스턴트는 따로 생성해서
		System.out.println("t7_instanceT1의 PI : " + t7.pi); // 패키지명.

		new Calculator();
		new Test2_1();  // ctrl+shift+o or ctrl+space
		new Test3_1();
	}
}
