package t4_method;

public class Test3_1Run {
	public static void main(String[] args) {
	
		int[] su = {90,80,100,70,60};
		
		Test3_1 t3 = new Test3_1();
		
		int res = t3.hap(su);  // t3. 없이 hap()이면 현재 class안에서 static main에서 메소드를 만들었으면 static을 붙여야 함 // ctrl+마우스 합
		System.out.println("총합 : " + res);
		System.out.println();
		
		res = t3.sum(su);
		System.out.println("총합2 : " + res);
		
		res = t3.hap(new int[] {1,2,3,4,5});
		System.out.println("총합3 : " + res);

		res = t3.sum(new int[] {1,2,3,4,5});
		System.out.println("총합4 : " + res);
		
		// res = t3.hap({1,2,3,4,5});  // (X)
		// res = t3.hap(1,2,3,4,5);  // (X)
		res = t3.sum(1,2,3,4,5);  // (O)  // ... 연산자 몇 개를 넘길지 모름
		System.out.println("총합5 : " + res);
	}

//	private static int hap() {  // 메소드 영역(자주 사용하는, 힙이나 스택에서 다 참조) jvm 맨 처음 맨 마지막 삭제
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
