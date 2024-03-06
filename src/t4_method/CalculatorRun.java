package t4_method;

import java.util.Scanner;

// 두 수와 연산자를 입력하면 해당 결과를 출력하는 프로그램..
public class CalculatorRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 수? ");
			int su1 = sc.nextInt();
			System.out.print("연산자? ");
			String operator = sc.next();
			System.out.print("두번째 수? ");
			int su2 = sc.nextInt();
			
			Calculator calc = new Calculator();
			calc.calc(su1, su2, operator);
			
			System.out.print("계속 하시겠습니까?(Y/N) ");  // Yes
			String ans = sc.next();
			
			//if(ans.charAt(0) == 'N' || ans.charAt(0) == 'n') break;  // .equals("Y")하면 Y입력했을때 
			//if(ans.equals("N") || ans.equals("n")) break;
			//if(ans.toUpperCase().equals("N")) break;  // 무엇을 입력하건 대문자로 바꿔줌
			if(ans.toLowerCase().equals("n")) break;
		}
		System.out.println("작업끝~~");
		
		sc.close();
	}
}
