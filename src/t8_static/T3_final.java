package t8_static;

public class T3_final {
	final String nation = "Korea";
	String jumin;
	String name;
	
	public T3_final() {}  //기본생성자
	
//	T3_final(String nation) {
//		this.nation = nation;
//	}
	
	T3_final(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return nation;
	}
}
