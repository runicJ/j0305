package t5_application;
// Value Object(VO, 변수 관리 객체) - 값 저장해서 가지고 다님.
// Data Transfer Object(DTO) - 데이터 변환하면서 가지고 다님.(VO와 DTO 혼용해서)
// MVC DAO 디자인패턴 // VO와 DTO 차이점.
public class StudentVO {
	private int no;  // 접근제한자 캡슐화
	String name;
	int age;
	boolean gender;
	String job;
	// alt sr alt a alt r
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {  // boolean은 get 대신 is
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	// 번호 저장하는 setter
//	void setNo(int no) {  // 카멜표기 관례  // 저장(set->setter)만 하면 return 타입 없음. 읽어오는 것(get->getter)
//		this.no = no;
//	}
//	
//	// 읽어서 값을 돌려보냄.
//	int getNo() {  // .this 안쓰더라도 필드가 됨
//		return no;
//	}
//	
//	void setName(String name) {
//		this.name = name;
//	}
//	
//	String getName() {
//		return name;
//	}
	
//	public int getNo() {  //Ctrl + space
//		return no;
//	}
//	
//	public void setNo(int no) {
//		this.no = no;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
	
}
