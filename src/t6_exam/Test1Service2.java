package t6_exam;

public class Test1Service2 {

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
	}

	void netpayPrint(Test1VO[] data, int cnt) {
		System.out.println("========================================================");
		System.out.println("사번\t사원명\t직급\t본봉\t수당\t공제액\t실수령액");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<cnt; i++) {
			System.out.println(data[i].getNo()+"\t"+data[i].getName()+"\t"+data[i].getJikkub()+"\t"+data[i].getBonbong()+"\t"+data[i].getSudang()+"\t"+data[i].getGongje()+"\t"+data[i].getNetpay());
		}
		System.out.println("========================================================");
		System.out.println("\t\t전체 인원 : " + cnt + "명");
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
