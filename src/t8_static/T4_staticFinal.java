package t8_static;

public class T4_staticFinal {
	static final String NATION = "Korea"; //대문자 //상수 //메소드 영역에 올라감
	final String jumin;
	String name;
		
	T4_staticFinal(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return NATION;
	}
}
