package t3_constructor;
// 생성자: 초기화 담당, 리턴타입x
public class Test3 {
	// 기본 생성자
	Test3() {}  // #1
	
	int atom = 30;  // atom(전역변수) 필드 // 초기값 0
	int atom2;
	double atom3;
	
	Test3(int su1) {  // #2
		System.out.println("su1 : " + su1);
	}
	
	Test3(int su1, int su2) {  // #3
		atom = su1;
		atom2 = su2;
	}
	
	Test3(int atom, double atom3) {  // #4
		this.atom = atom;  // 필드의 atom = 매개변수 atom
		this.atom3 = atom3;
	}
	
	Test3(double su2, int su1) {}
	
	//Test2(int atom1, int atom2) {}
}
