package ch05_swing_advanced;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame{
	private Container contentPane;
	
	public ToolBarEx() throws HeadlessException {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);

	}
  //툴바 생성 메소드
	private void createToolBar() {
	 //툴바생성
		JToolBar toolBar = new JToolBar("Kitae Menu");//툴바이름 설정
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		//툴바 메뉴 컴포넌트 추가
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("E:\\Users\\Administrator\\git\\interfaceWorkspace\\ch16\\src\\images\\open.jpg")));
		toolBar.addSeparator();//구분자 추가
		toolBar.add(new JButton(new ImageIcon("E:\\Users\\Administrator\\git\\interfaceWorkspace\\ch16\\src\\images\\save.jpg")));
		toolBar.addSeparator();//구분자 추가
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		//툴바를 컨테이너 위쪽에 부착
		contentPane.add(toolBar,BorderLayout.NORTH);
		
	}

	public static void main(String [] args) {
		new ToolBarEx();
	}

}
