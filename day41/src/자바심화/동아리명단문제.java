package 자바심화;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Dto.MemberDto;

public class 동아리명단문제 {

	public static void main(String[] args) {
		
		HashMap<Integer, MemberDto> club = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		MemberDto dto = new MemberDto();
		
		dto.setName("김길동");
		dto.setGrade(1);
		dto.setCredit("A");
		dto.setTel("010.1234.1111");
		club.put(1, dto);
		
		MemberDto dto2 = new MemberDto();
		dto2.setName("이길동");
		dto2.setGrade(2);
		dto2.setCredit("C");
		dto2.setTel("010.1111.3333");
		club.put(2, dto2);
		
		MemberDto dto3 = new MemberDto();
		dto3.setName("박길동");
		dto3.setGrade(3);
		dto3.setCredit("D");
		dto3.setTel("010.2222.0111");
		club.put(3, dto3);

		while(true) {		
		System.out.println("===============");
		System.out.println("1. 동아리 명단 출력 ");
		System.out.println("2. 동아리 인원 추가 ");
		System.out.println("3. 동아리 인원 삭제 ");
		System.out.println("9. 종료 ");
		System.out.print("메뉴를 선택하시오>> ");
		int choice = sc.nextInt();

		if (choice == 9) {
			System.out.println("시스템을 종료합니다.");
			break;
		}
		
		else if (choice == 1) {//동아리 명단 출력
			System.out.println("동아리 명단입니다.");
			System.out.println("이름   학년  학점     핸드폰번호");
			System.out.println("=================================");
			System.out.println(club);
			}
		else if (choice == 2) {//동아리 인원 추가
			MemberDto dto4 = new MemberDto();
			System.out.println("추가할 동아리원의 이름을 입력해주세요>> ");
			String name = sc.next();
			dto4.setName(name);
			System.out.println("추가할 동아리원의 학년을 입력해주세요>> ");
			int grade = sc.nextInt();
			dto4.setGrade(grade);
			System.out.println("추가할 동아리원의 학점을 입력해주세요>> ");
			String credit = sc.next();
			dto4.setCredit(credit);
			System.out.println("추가할 동아리원의 핸드폰번호를 입력해주세요>> ");
			String tel = sc.next();
			dto4.setTel(tel);
			club.put(4,dto4);
		}

//		else if (choice == 3) {//동아리 인원 삭제
//			
//			}
//		
//        else {//1~4, 9가 아닌 경우
//	   JOptionPane.showInputDialog(null,"해당 숫자가 없습니다. 다시 입력해주세요.");
//       }
        
        sc.close();
		


		
		
		}

	}

}
