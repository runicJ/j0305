package t7_instance;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("pi : " + t1.pi);
		
		double area = t1.circleArea(10);
		System.out.println("반지름 10인 원넓이는? " + area);
		// System.out.println("반지름 10인 원넓이는? " + t1.circleArea(10));
	}
}
