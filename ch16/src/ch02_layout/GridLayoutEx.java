package ch02_layout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//flow layout-���帧�� ���� ��ġ�ǵ��� ����
public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("GridLayout ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�����̳� ���
		Container c = getContentPane();
		
		//grid���̾ƿ� ����
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);//���� ���� 5px
		
		//��ġ������ ����
		c.setLayout(grid);//4�� 2�� 
		//������Ʈ ����
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		setSize(new Dimension(300, 200));
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
