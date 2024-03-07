package t8_static;

public class T3_finalRun2 {
	public static void main(String[] args) {
		T3_final2 t3_2 = new T3_final2("1234-12345");
		System.out.println("t3_2.jumin : " + t3_2.jumin);
		System.out.println("1.name : " + t3_2.name);
		
		// t3_2.jumin = "2222-2222";  // final로 생성할때 이미 주었기에 못 바꿈.
		t3_2.name = "홍길동";
		System.out.println("2.name : " + t3_2.name);
		t3_2.name = "홍길창";
		System.out.println("3.name : " + t3_2.name);
	}
}
