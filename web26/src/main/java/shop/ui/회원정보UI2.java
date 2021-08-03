package shop.ui;

import javax.swing.JOptionPane;

import shop.db.회원DAO2;
import shop.dto.회원Bag;

public class 회원정보UI2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("회원가입 id입력>>");
		String pw = JOptionPane.showInputDialog("회원가입 pw입력>>");
		String name = JOptionPane.showInputDialog("회원가입 name입력>>");
		String tel = JOptionPane.showInputDialog("회원가입 tel입력>>");
		
		회원DAO2 dao2 = new 회원DAO2();
		회원Bag bag = new 회원Bag();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		dao2.create(bag);
		//dao.create(id, pw, name, tel); => dao.create(bag);로 변경하고싶음 
		//회원DAO2에서 public void create(String id, String pw, String name, String tel )
		//public void create(회원Bag bag)로 수정
	}

}
