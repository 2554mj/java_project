package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개 이미지");
		f.getContentPane().setBackground(Color.GRAY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(65, 20, 350, 180);
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(65, 240, 350, 180);
		f.getContentPane().add(m);
		
		ImageIcon car1 = new ImageIcon("ck1.png");
		ImageIcon car2 = new ImageIcon("ck2.png");
		b.setIcon(car1);
		m.setIcon(car2);
		
		
		
		
		f.setVisible(true);
		

	}
}
