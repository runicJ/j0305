package t1_class;

public class Test4 {
	public static void main(String[] args) {  // jvm은 main이 있어야 실행가능  // main 없으면 지원용
		Test1 t1 = new Test1();  // 객체 타입 Test1 // 설계도 생성 -> 메모리(힙 메모리) 올라감 // 스텍(t1-150) 힙주소값 올라감
		Test1 t2 = new Test1();  // 같은 설계도로 만들어졌지만 t1과 t2는 다른 객체.(힙에서도 따로)
		
		if(t1 == t2) {  // == 수치, 주소 비교
			System.out.println("t1객체와 t2객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t2객체는 서로 다른 객체입니다.");
		}
		
		Test1 t3;  // 같은 타입  // 값이 없어 비교x
		t3 = t1;  // 얕은 복사(주소만 주고, 같은 곳을 가리킴)
		if(t1 == t3) {
			System.out.println("t1객체와 t3객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t3객체는 서로 다른 객체입니다.");
		}
		
		Test1 t4 = null;
		if(t1 == t4) {
			System.out.println("t1객체와 t4객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t4객체는 서로 다른 객체입니다.");
		}
		
		if(t4 == null) {  // null은 주소로 비교해야 한다
			System.out.println("t4는 null입니다.");
		}
		else {
			System.out.println("t4는 null이 아닙니다.");
		}
		
		// null 비교시는 '== / !='로 비교해야 한다. 아래는 실행오류(NullPointerException) 발생.
//		if(t4.equals(null)) {  // 비교할만한 것이 없다는 오류
//			System.out.println("t4는 null입니다.");
//		}
//		else {
//			System.out.println("t4는 null이 아닙니다.");
//		}
	}
}
