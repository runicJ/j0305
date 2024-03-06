package t5_application;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;
		String name;
		int age;
		boolean gender;
		String job;
		int choice;
		
		System.out.print("번호를 입력하세요? ");
		no = sc.nextInt();
		System.out.print("성명을 입력하세요? ");
		name = sc.next();
		System.out.print("나이를 입력하세요? ");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요?(1:남자, 2:여자) ");
		choice = sc.nextInt();
		if(choice == 1) gender = true;
		else gender = false;
		
		System.out.print("직업을 입력하세요? ");
		job = sc.next();
		
		StudentService service = new StudentService();
		service.print(no, name, age, gender, job);  // 메소드() ctrl + 클릭
		
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}
}
