package t8_static;

public class T1 {
	// 인스턴스 필드
	//double pi = 3.141592;
	
	// 정적 필드(인스턴스 필드x)
	public static double pi = Math.PI;  // 전역변수  // public 캡슐화
	
	// 정적 메소드(인스턴트 메소드x)
	static double circleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}

//private 클래스 안에서만 사용
//public
//default 자기 패키지 안에서만 사용