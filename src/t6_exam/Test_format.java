package t6_exam;

public class Test_format {
	public static void main(String[] args) {
		int su = 1234000;
		double su2 = 1234000.123;
		String su3 = "1234000";
		System.out.printf("금액 : %,d\n", su);  // String 객체에서 제공하는 방식
		System.out.printf("금액 : %,10d\n", su);  // 10자리 확보된 상황에서 ,
		System.out.printf("금액 : %,15.2f\n", su2);  // 15자리 확보된 상황에서 , 소수이하 두자리 포함
		System.out.println(String.format("%,15d", su));
		System.out.println(String.format("%,15d", Integer.parseInt(su3)));  // 문자형식의 숫자=>숫자(d는 정수) wrapper class integer  // su3정수로
	}
}
