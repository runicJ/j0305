package t2_field;

public class Test_val {
	int su3 = 10;  // 필드 전역변수 class 날아갈때 같이 날라감.
	public void atom() {
		int su1 = 100;
		
		for(int i=0; i<5; i++) {
			int su2 = 200 * i;
			System.out.println(su1 + su2);
		}
		
		su3 += su1;
		System.out.println("su3 : " + su3);
	}
}
