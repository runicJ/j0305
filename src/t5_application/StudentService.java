package t5_application;

public class StudentService {
	
	void print(int no, String name, int age, boolean gender, String job) {
		String genderOk = genderCheck(gender); // 보내는 애 타입 지워서  // 메소드()
		
		//boolean ageOk = ageCheck(age);
		String ageOk;
		if(ageCheck(age)) ageOk= "성인";
		else ageOk = "미성년";
		
		System.out.println("번호:"+no+", 성명:"+name+", 나이:"+age+", 성별:"+genderOk+", 직업:"+job+", 비고:"+ageOk);
	}
	
	String genderCheck(boolean gender) {  // alt + <-
		String res = "";
		if(gender) res = "남자";  // true를 참으로 (!gender)false 참으로// if(gender == true) // if 안의 결과값은 true나 false
		else res = "여자";
		return res;
	}
	
	boolean ageCheck(int age) {  // 받는애 타입 필요
		if(age >= 20) return true;
		else return false;
	}
}
