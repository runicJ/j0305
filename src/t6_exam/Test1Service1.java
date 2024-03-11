package t6_exam;

public class Test1Service1 {

	public void netPayCalculate(Test1VO vo) {
		// 본봉 계산
		vo.setBonbong(bonbongCalculate(vo.getCode()));
		
		// 직급명 처리
		vo.setJikkub(jikkubProcess(vo.getCode()));
		
		// 수당 계산
		vo.setSudang(sudangCalculate(vo.getOverTime()));
		
		// 공제액 계산
		vo.setGongje(gongjeCalculate(vo.getBonbong(), vo.getSudang()));
		
		// 실수령액 계산
		vo.setNetpay(netpayCalculate(vo.getBonbong(), vo.getSudang(), vo.getGongje()));
		
		// 출력하기
		netpayPrint(vo);
	}

	void netpayPrint(Test1VO vo) {
		System.out.println("========================================================");
		System.out.println("사번\t사원명\t직급\t본봉\t수당\t공제액\t실수령액");
		System.out.println("--------------------------------------------------------");
		System.out.println(vo.getNo()+"\t"+vo.getName()+"\t"+vo.getJikkub()+"\t"+vo.getBonbong()+"\t"+vo.getSudang()+"\t"+vo.getGongje()+"\t"+vo.getNetpay());
		System.out.println("========================================================");
	}


	private int netpayCalculate(int bonbong, int sudang, int gongje) {
		return bonbong + sudang - gongje;
	}

	private int gongjeCalculate(int bonbong, int sudang) {
		return (bonbong + sudang) / 10;
	}

	private int sudangCalculate(int overTime) {
		return overTime * 25000;
	}
	
	private String jikkubProcess(char code) {
		if(code == 'B') return "부장";
		else if(code == 'K') return "과장";
		else if(code == 'D') return "대리";
		else if(code == 'S') return "사원";
		else return "외부인";
	}

	private int bonbongCalculate(char code) {
		if(code == 'B') return 5000000;
		else if(code == 'K') return 4000000;
		else if(code == 'D') return 3000000;
		else if(code == 'S') return 2000000;
		else return 0;
	}
}
