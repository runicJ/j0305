package t4_method;

public class Test3_1 {

	public int hap(int[] su) {  // 메소드명
		int hap = 0;  // 변수(필드x)
		for(int i=0; i<su.length; i++) {
			hap += su[i];
		}
		return hap;
	}

	public int sum(int ... su) {  // 자바에서 지원하는 연산자 - 여러개 값이 넘어갈때
		int sum = 0;
		for(int i=0; i<su.length; i++) {
			sum += su[i];
		}
		return sum;
	}

}
