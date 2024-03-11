package t6_exam;

import java.util.Scanner;

/*
 	사원코드(no), 사원명(name), 직급코드(code)와 초과시간(overTime)을 입력받아서 실수령액(netpay)을 계산하시오.
	직급코드 : 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s
	1시간당 초과수당(sudang)은 25000원이다.
	공제액(gongje)은 (본봉(bonbong)+수당)의 10%로 한다.
	본봉 : 부장-5000000, 과장-4000000, 대리-3000000, 사원-2000000
	실수령액 = 본봉 + 수당 - 공제액
	계산부는 비즈니스로직으로 처리(서비스객체를 사용)
	작업을 계속할 것인지 여부
*/

public class Test1Run_급여계산2 {
//static Test1VO[] data = new Test1VO[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test1Service2 service = new Test1Service2();
		Test1VO[] data = new Test1VO[100];

		int cnt = 0;

		while (true) {
			Test1VO vo = new Test1VO(); // 전부 다른 객체
			System.out.print("사원코드를 숫자로 입력하세요 ==> ");
			vo.setNo(sc.next());
			System.out.print("사원명을 입력하세요 ==> ");
			vo.setName(sc.next());
			while (true) {
				char jikkubCode;
				System.out.print("직급코드를 입력하세요(B(부장), K(과장), D(대리), S(사원) ==> ");
				jikkubCode = sc.next().toUpperCase().charAt(0);
				if (jikkubCode == 'B' || jikkubCode == 'K' || jikkubCode == 'D' || jikkubCode == 'S') {
					vo.setCode(jikkubCode);
					break;
				}
			}
			System.out.print("초과시간을 입력하세요 ==> ");
			vo.setOverTime(sc.nextInt());

			// 입력받은 자료들로 급여 계산하기
			service.netPayCalculate(vo);

			// 처리된 자료들을 배열에 저장하기
			data[cnt] = vo; // data 배열이름
			cnt++;

			System.out.print("작업을 계속하시겠습니까?(Y/N) ");
			String yn = sc.next();
			if (yn.toUpperCase().charAt(0) == 'N')
				break;
		}
		// 출력하기
		service.netpayPrint(data, cnt);

		sc.close();
	}
}
