package t4_method;

import java.util.Scanner;

public class Test2_2Run {
	public static void main(String[] args) {
		Test2_2 t2 = new Test2_2();
		int res;
		
		t2.mod1();
		res = t2.mod2(50);  //변수명을 atom으로 써도 관계없음. 통일 시키는 것이 좋다.
		System.out.println("res : " + res);
		
		res = t2.mod1(20, 50);
		System.out.println("res : " + res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수? ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수? ");
		int su2 = sc.nextInt();
		
		// 덧셈
		res = t2.add(su1, su2);
		t2.prn(su1, su2, res, "+");
		
		// 뺄셈
		res = t2.sub(su1, su2);
		t2.prn(su1, su2, res, "-");
		
		// 곱셈
		res = t2.mul(su1, su2);
		t2.prn(su1, su2, res, "*");
		
		// 나눗셈
		double res2 = t2.div(su1, su2);
		//System.out.println(su1 + " / "+su2+" = %.2f" + res);
		System.out.printf("%d / %d = %.1f", su1, su2, res2);
		
		sc.close();
	}
}
