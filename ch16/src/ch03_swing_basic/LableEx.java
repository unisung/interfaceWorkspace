package ch03_swing_basic;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LableEx extends JFrame{
		public LableEx() throws HeadlessException {
		setTitle("���̺� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�.");
		
		
		ImageIcon beauty = new ImageIcon("E:\\seoulit\\javaWorkspace\\ch16\\src\\images\\beauty.jpg");
		//ImageIcon beauty = new ImageIcon("beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		//�̹��� ������ ��ü
		ImageIcon normalicon = new ImageIcon("E:\\seoulit\\javaWorkspace\\ch16\\src\\images\\normalIcon.gif");
		JLabel imageLabel2 = new JLabel("��������� ��ȭ�ϼ���",normalicon,SwingConstants.CENTER);
		;
		
		c.add(textLabel); c.add(imageLabel);c.add(imageLabel2);
		
		setSize(400,600);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	 new LableEx();
}
}
