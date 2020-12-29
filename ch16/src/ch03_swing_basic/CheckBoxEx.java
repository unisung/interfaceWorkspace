package ch03_swing_basic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CheckBoxEx extends JFrame{
		public CheckBoxEx() throws HeadlessException {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		ImageIcon cherryIcon = new ImageIcon("E:\\seoulit\\javaWorkspace\\ch16\\src\\images\\cherry.jpg");
		ImageIcon selectedIcon = new ImageIcon("E:\\seoulit\\javaWorkspace\\ch16\\src\\images\\selectedCherry.jpg");

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true);
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	 new CheckBoxEx();
}
}
