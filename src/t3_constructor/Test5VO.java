package t3_constructor;
//오버로딩
public class Test5VO {
	private String name;  // private 외부에서 접근x
	private String mid;
	private String password;
	private int age;
	private boolean gender;
	private String address;
	
	public Test5VO() {}  // 기본생성자(빈곳 ctrl+space)
	
	//객체를 생성할때 처음에 값을 주고 처리(단점 기본생성자x)
	public Test5VO(String name, String mid, String password, int age, boolean gender, String address) {  // 생성자
		super();
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	// 중간에 값을 바꿀때
	public String getName() {  
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

// getter setter 값을 불러오고 저장, 값을 함부로 못 바꾸게, 유효성검사