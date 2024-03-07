package t7_instance;

public class Test1 {
	// 인스턴스 필드
	//double pi = 3.141592;
	public double pi = Math.PI;  // 전역변수
	
	// 인스턴트 메소드
	double circleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}
