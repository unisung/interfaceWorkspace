package ch02_layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//flow layout-물흐름에 따라 배치되듯이 정렬
public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨테이너 얻기
		Container c = getContentPane();
		
		//배치관리자 지정
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//왼쪽, 수평30px, 수직40px
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(new Dimension(300, 200));
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
