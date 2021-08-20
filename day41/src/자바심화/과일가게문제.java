package 자바심화;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 과일가게문제 {

	public static void main(String[] args) {
		//과일목록 들어갈 리스트
		HashMap<String, Integer> fruite = new HashMap<>();
		fruite.put("사과", 5000);
		fruite.put("오렌지", 4000);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===============");
			System.out.println("1. 과일목록 출력 ");
			System.out.println("2. 과일추가 ");
			System.out.println("3. 과일삭제 ");
			System.out.println("4. 과일가격변경 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴를 선택하시오>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else if (choice == 1) {//과일목록출력
					System.out.println("과일목록은 " + fruite);
				}
			
			else if (choice == 2) {//과일추가
				System.out.print("추가하실 과일을 입력해주세요>> ");
				String addName = sc.next();
				System.out.print("추가하실 과일의 가격을 입력해주세요>> ");
				int addPrice = sc.nextInt();
				int size1 = fruite.size();
				fruite.put(addName, addPrice);
				int size2 = fruite.size();
				if (size2 > size1) {
				System.out.println("과일이 추가되었습니다.");
				}
			}

			else if (choice == 3) {//과일삭제
				System.out.println(fruite);
				System.out.println("삭제할 과일을 입력해주세요>> ");
				String deleteName = sc.next();
				int size1 = fruite.size();
				fruite.remove(deleteName);
				int size2 = fruite.size();
				if (size2 > size1) {
				System.out.println("과일이 삭제되었습니다.");
				}
				
			}

			else if (choice == 4) {//가격변경
				System.out.println(fruite);
				System.out.println("가격을 수정 할 과일 입력해주세요.>> ");
				String editName = sc.next();
				System.out.println("수정할 가격을 입력해주세요.>> ");
				int editPrice = sc.nextInt();
				fruite.replace(editName, editPrice);
				int edit2 = fruite.get(editName);
				System.out.println("수정완료! 변경된내용=> " +editName +"="+ edit2);
			}
			else {//1~4, 9가 아닌 경우
				JOptionPane.showInputDialog(null,"해당 숫자가 없습니다. 다시 입력해주세요.");
			}
		}
				
		sc.close();

	}
}



