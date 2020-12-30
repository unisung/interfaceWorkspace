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
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);

	}
  //���� ���� �޼ҵ�
	private void createToolBar() {
	 //���ٻ���
		JToolBar toolBar = new JToolBar("Kitae Menu");//�����̸� ����
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		//���� �޴� ������Ʈ �߰�
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("E:\\Users\\Administrator\\git\\interfaceWorkspace\\ch16\\src\\images\\open.jpg")));
		toolBar.addSeparator();//������ �߰�
		toolBar.add(new JButton(new ImageIcon("E:\\Users\\Administrator\\git\\interfaceWorkspace\\ch16\\src\\images\\save.jpg")));
		toolBar.addSeparator();//������ �߰�
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		//���ٸ� �����̳� ���ʿ� ����
		contentPane.add(toolBar,BorderLayout.NORTH);
		
	}

	public static void main(String [] args) {
		new ToolBarEx();
	}

}
