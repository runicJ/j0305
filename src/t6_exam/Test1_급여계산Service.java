//package t6_exam;
//
////사원코드(no), 사원명(name), 직급코드(code)와 초과시간(overTime)을 입력받아서 실수령액(netpay)을 계산하시오.
////직급코드 : 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s
////1시간당 초과수당(sudang)은 25000원이다.
////공제액(gongje)은 (본봉(bonbong)+수당)의 10%로 한다.
////본봉 : 부장-5000000, 과장-4000000, 대리-3000000, 사원-2000000
////실수령액 = 본봉 + 수당 - 공제액
//public class Test1_급여계산Service {
//
//	public void netPayCalculate(Test1_VO vo) {
//		// 본봉 계산
//		vo.setBonbong(bonbongCalculate(vo.getCode()));
//		
//		// 직급명 처리
//		vo.setJikkub(jikkubProcess(vo.getCode()));
//		
//		// 수당 계산
//		vo.setSudang(sudangCalculate(vo.getOverTime()));
//		
//		// 공제액 계산
//	}
//}
