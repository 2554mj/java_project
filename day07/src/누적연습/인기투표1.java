package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yes = 0, no =0;
		
		for (int i = 0; i < 10; i++) {
			String re = JOptionPane.showInputDialog("배가 고픈가요?(배고프면1, 안고프면2)");
			switch (re) {
			case "1":
				yes++;
				break;
            case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2 중 숫자만 입력해주세요.");
				i--;//결과가 10개가 나올 수 있게 만들기 위한 코드
				break;
				
			}
		}//for
		System.out.println("배고픈사람:" + yes + "명");
		System.out.println("배고픈사람:" + no + "명");

	}

}
