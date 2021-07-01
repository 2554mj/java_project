package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표2 {

	public static void main(String[] args) {
		// 
		int IU = 0, JS = 0, BTS = 0;
		
		for (int i = 0; i < 100; i++) {
			String re = JOptionPane.showInputDialog("가장 맘에드는 연예인은?(IU:1, 유재석:2, BTS:3)");
			switch (re) {
			case "1":
				IU++;
				break;
            case "2":
				JS++;
				break;
            case "3":
				BTS++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2,3 중 숫자만 입력해주세요.");
				i--;//
				break;
				
			}
		}//for
		System.out.println("아이유:" + IU + "명");
		System.out.println("유재석:" + JS + "명");
		System.out.println("BTS:" + BTS + "명");

	}

}
