package t10_Getter_Setter;

public class Test2Service {

	public String setGenderCheck(int sex) {
		if(sex == 1 || sex == 3) return "남자";
		else return "여자";
	}
	
}
