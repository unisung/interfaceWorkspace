package ch02_layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//flow layout-물흐름에 따라 배치되듯이 정렬
public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨테이너 얻기
		Container c = getContentPane();
		
		//배치관리자 지정
		c.setLayout(new BorderLayout(30, 20));//수평30px, 수직20px
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		
		setSize(new Dimension(300, 200));
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
