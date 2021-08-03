package shop.ui;

import javax.swing.JOptionPane;

import shop.db.회원DAO;

public class 회원정보UI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("회원가입 id입력>>");
		String pw = JOptionPane.showInputDialog("회원가입 pw입력>>");
		String name = JOptionPane.showInputDialog("회원가입 name입력>>");
		String tel = JOptionPane.showInputDialog("회원가입 tel입력>>");
		
		회원DAO dao = new 회원DAO();
		dao.create(id, pw, name, tel);
		//
	}

}
