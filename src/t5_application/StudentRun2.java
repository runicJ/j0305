package t5_application;

import java.util.Scanner;

public class StudentRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StudentVO vo = new StudentVO();
		
		System.out.print("번호를 입력하세요? ");
		vo.setNo(sc.nextInt());  // 접근 경로 setter getter로
		// vo.no = sc.nextInt();  // 필드로 접근 보안 위험. 접근제한자 private
		System.out.print("성명을 입력하세요? ");
		vo.setName(sc.next());
		System.out.print("나이를 입력하세요? ");
		vo.setAge(sc.nextInt());
		System.out.print("성별을 입력하세요?(1:남자, 2:여자) ");
		int choice = sc.nextInt();
		if(choice == 1) vo.setGender(true);
		else vo.setGender(false);
		
		System.out.print("직업을 입력하세요? ");
		vo.setJob(sc.next());
		
		StudentService2 service = new StudentService2();
		service.print(vo);
		
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}
}
