package ch02_layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//flow layout-물흐름에 따라 배치되듯이 정렬
public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("GridLayout ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨테이너 얻기
		Container c = getContentPane();
		
		//grid레이아웃 설정
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);//수직 간격 5px
		
		//배치관리자 지정
		c.setLayout(grid);//4행 2열 
		//컴포넌트 부착
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		setSize(new Dimension(300, 200));
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
