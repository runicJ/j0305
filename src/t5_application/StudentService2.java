package t5_application;

public class StudentService2 {
	
	String genderCheck(boolean gender) {
		String res = "";
		if(gender) res = "남자";
		else res = "여자";
		return res;
	}
	
	boolean ageCheck(int age) {
		if(age >= 20) return true;
		else return false;
	}

	public void print(StudentVO vo) {  // StudentVO 타입
		String genderOk = genderCheck(vo.isGender());  //genderCheck 함수호출
		String ageOk;
		if(ageCheck(vo.getAge())) ageOk= "성인";
		else ageOk = "미성년";
		
		System.out.println("번호:"+vo.getNo()+", 성명:"+vo.getName()+", 나이:"+vo.getAge()+", 성별:"+genderOk+", 직업:"+vo.getJob()+", 비고:"+ageOk);
	}
}
