package t6_exam;

//사원코드(no), 사원명(name), 직급코드(code)와 초과시간(overTime)을 입력받아서 실수령액(netpay)을 계산하시오.
//직급코드 : 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s
//1시간당 초과수당(sudang)은 25000원이다.
//공제액(gongje)은 (본봉(bonbong)+수당)의 10%로 한다.
//본봉 : 부장-5000000, 과장-4000000, 대리-3000000, 사원-2000000
//실수령액 = 본봉 + 수당 - 공제액
public class Test1_급여계산Service {

	public void print(Test1_급여계산VO vo) {
		int bonbongOk = bonbongCheck(vo.getCode());
		
		System.out.println("사원코드:"+vo.getNo()+", 사원명:"+vo.getName()+", 직급코드:"+vo.getCode()+", 초과시간:"+vo.getOverTime()+", 본봉:"+bonbongOk+", 실수령액:");
	}

	int sudangcheck(int overtime) {
		int sudang = overtime * 25000;
		return sudang;
	}
	int gongjeCheck(int bonbong, int sudang) {
		int gongje = (int)((bonbong + sudang) * 0.1);
		return gongje;
	}
	int netpayCheck(int bonbong, int sudang, int gongje) {
		int netpay = bonbong + sudang - gongje;
		return netpay;
	}
	
	int bonbongCheck(String code) {
		int bonbong = 0;
		if(code.toUpperCase().equals("B")) bonbong = 5000000;
		else if(code.toUpperCase().equals("K")) bonbong = 4000000;
		else if(code.toUpperCase().equals("D")) bonbong = 3000000;
		else if(code.toUpperCase().equals("S")) bonbong = 2000000;
		else System.out.println("올바른 직급코드를 입력하세요!");
		return bonbong;
	}
	
}
