package t4_method;

public class Test1 {
	int su1;  // 필드
	double su2;
	String name = "홍길동";
	
	public Test1() {}  // 빈곳에 ctrl+space 첫번째 기본생성자
	
	Test1(int su1) {  // 사용자가 만든 생성자가 있으면 컴파일러가 자동으로 기본생성자 만들어지지 않음
		this.su1 = su1;  // 값을 바꾸려고 만듬
	}
	
	void mod1() {  // 메소드는 클래스명과 같으면 안됨. Test1
		
	}
	
	void mod1(int su1) {
		this.su1 = su1;
	}
	
	void mod1(int su1, double su2) {  // 메소드 오버로딩(같은 메소드 이름일때 매개변수의 타입, 개수, 순서로 구별)  // 받는쪽이 크면 상관없음(byte그릇이 작음)
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void mod2() {
		System.out.println("안녕하세요...");
	}

	void mod3() {
		//System.out.println(this.name + "님 안녕하세요...");
		System.out.println(name + "님 안녕하세요...");  // 실행블록 안에서 name에 대한 언급이 없음. 매개변수 지정 안되어 있으면 필드부터 확인
	}
	
	void mod3(String name) {  // 입력받은 name
		System.out.println(name + "님 안녕하세요...");
	}
	
	void mod4(String name) {
		System.out.println(this.name + "님 안녕하세요...");
		System.out.println(name + "님 안녕하세요...");
	}
	
	void mod5(int i) {
		System.out.println(i + ".안녕하세요...");
	}

	// 3의 배수가 되면 메소드 종료처리 하세요.
	void mod6() {
		int i = 0;
		while(i<5) {
			i++;
			System.out.println(i + ".안녕하세요...");
			//if(i % 3 == 0) break;  //블록을 빠져나감
			if(i % 3 == 0) return;	//밑을 보지 않음
			System.out.println("작업중");
		}
		System.out.println("작업끝~~~~~");
	}
}
