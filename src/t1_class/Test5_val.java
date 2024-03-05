package t1_class;

public class Test5_val {
	public static void main(String[] args) {
		int su1 = 100, su3;  // 전역변수
		
		for(int i=0; i<5; i++) {
			int su2 = 200 * i;
			System.out.println(su1 + su2);
		}
		
		//su3 = su1 + su2;  // for 안에서만 사용하고 가비지 컬렉터가 날림 (블록 안에서만 사용 (로컬)지역변수)
	}
}

