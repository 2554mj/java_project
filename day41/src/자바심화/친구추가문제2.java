package 자바심화;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 친구추가문제2 {

	public static void main(String[] args) {
		//친구목록 들어갈 리스트
		HashMap<String, String> friends = new HashMap<>();
		friends.put("010.1111.1111", "홍길동");
		friends.put("010.1111.1112", "이길동");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===============");
			System.out.println("1. 친구리스트 출력 ");
			System.out.println("2. 친구추가 ");
			System.out.println("3. 친구삭제 ");
			System.out.println("4. 이름변경 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴를 선택하시오>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else if (choice == 1) {//친구리스트
					System.out.println("친구목록은 " + friends);
				}
			
			else if (choice == 2) {//친구추가
				System.out.print("추가하실 친구의 핸드폰번호를 입력해주세요>> ");
				String addPhone = sc.next();
				System.out.print("추가하실 친구의 이름을 입력해주세요>> ");
				String addName = sc.next();
				int size1 = friends.size();
				friends.put(addPhone, addName);
				int size2 = friends.size();
				if (size2 > size1) {
				System.out.println("친구가 추가되었습니다.");
				}
			}

			else if (choice == 3) {//친구삭제
				System.out.println("친구 삭제를 진행합니다.");
				System.out.println(friends);
				System.out.println("삭제할 친구의 핸드폰번호를 입력해주세요>> ");
				String no = sc.next();
				int size1 = friends.size();
				friends.remove(no);
				int size2 = friends.size();
				if (size2 > size1) {
				System.out.println("친구가 삭제되었습니다.");
				}
				
			}

			else if (choice == 4) {//정보변경
				System.out.print("친구 정보를 변경합니다.");
				System.out.println(friends);
				System.out.println("수정할 친구의 핸드폰번호를 입력해주세요.>> ");
				String editNo = sc.next();
				System.out.println("수정할 친구의 이름을 입력해주세요.>> ");
				String editName = sc.next();
				friends.replace(editNo, editName);
				String edit2 = friends.get(editNo);
				System.out.println("수정완료! 변경된내용=> " +editNo +"="+ edit2);
			}
			else {//1~4, 9가 아닌 경우
				JOptionPane.showInputDialog(null,"해당 숫자가 없습니다. 다시 입력해주세요.");
			}
		}
				
		sc.close();

	}
}



