package t10_Getter_Setter;

public class Test1Run {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		
		System.out.println("name : " + test1.getName());  // private이 있어서 test1.name 안됨
	
		//test1.name = "김말숙";
		test1.setName("김말숙");
		System.out.println("name : " + test1.getName());
		
		test1.setAge(10);
		System.out.println("age : " + test1.getAge());
		
		// false:여자, true:남자
		test1.setGender(false);
		System.out.println("gender : " + test1.getSex());
	}
}
