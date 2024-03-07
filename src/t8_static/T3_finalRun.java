package t8_static;

public class T3_finalRun {
	public static void main(String[] args) {
		T3_final t3 = new T3_final();  // 기본생성자
		System.out.println("t3.nation : " + t3.nation);
		System.out.println("t3.jumin : " + t3.jumin);
		System.out.println();
		
		// t3.nation = "USA";
		
		T3_final t3_2 = new T3_final("1234-12345");
		//System.out.println("t3_2.jumin : " t3_2.jumin);
	}
}
