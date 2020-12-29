package ch03_swing_basic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ButtonEx extends JFrame{
		public ButtonEx() throws HeadlessException {
		setTitle("이미지버튼 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		ImageIcon normalIcon = new ImageIcon("E:\\seoulit\\javaWorkspace\\ch16\\src\\images\\normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("E:\\seoulit\\javaWorkspace\\ch16\\src\\images\\pressedIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("E:\\seoulit\\javaWorkspace\\ch16\\src\\images\\rolloverIcon.gif");

		JButton btn = new JButton("call~~",normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		
		setSize(400,600);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	 new ButtonEx();
}
}
