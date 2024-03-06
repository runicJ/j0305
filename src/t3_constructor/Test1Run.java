package t3_constructor;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();  // jvm이 힙 영역에 올림
		
		System.out.println("t1 : " + t1);  // 패키지명.클래스명@메모리주소(16진수) (t1 : t3_constructor.Test1@15db9742)
		System.out.println("t1 : " + t1.toString()); // toString객체(Object(클래스)객체)가 생략되어 있다
	}
}
