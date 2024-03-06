package t3_constructor;

public class Test2 {
	// 기본 생성자
	Test2() {}  // 클래스이름=생성자명  
	// 개발자 선언한 생성자 존재 시 컴파일러는 기본 생성자 추가하지 않음
	// new 연산자로 객체 생성시 개발자가 선언한 생성자 반드시 사용
	Test2(int su1) {}  // 오버로딩 매개변수 타입의 종류,개수,순서
	
	Test2(int su1, int su2) {}
	
	Test2(int su1, double su2) {}
	
	Test2(double su2, int su1) {}
	
	//Test2(int su2, int su1) {}  // 변수명 볼 필요 없음. 매개'변수'의 타입
	//Test2(int atom1, int atom2) {}
}
