package t4_method;

public class Test2_2 {
	void mod1() {
		System.out.println("안녕");
	}
	
	int mod2(int su1) {  // 리턴 타입
		// return 10;  // 리턴 타입에 맞는 리턴값 없으면 에러 
		return su1;
	}
	
	int mod1(int su1) {  // 오버로딩
		return su1;
	}
	
//	int mod1() {  // 리턴타입 관계없이 매개변수의 순서, 개수, 종류
//		return 10;
//	}
	
	int mod1(int su1, int su2) {  // 함수(메소드)
		return su1 + su2;
	}
	
	// 덧셈
	int add(int su1, int su2) {
		return su1 + su2;
	}
	
	// 빼기 (sub)
	int sub(int su1, int su2) {
		return su1 - su2;
	}
	
	// 곱하기 (mul)
	int mul(int su1, int su2) {
		return su1 * su2;
	}
	
	// 나누기(div)
	double div(int su1, int su2) {
		return (double)su1 / su2;
	}
	
	void prn(int su1, int su2, int res, String operator) {
		System.out.println(su1 + operator + su2 + " = " + res);
	}
}
