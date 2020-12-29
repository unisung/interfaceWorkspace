package ch01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() throws HeadlessException {
			setTitle("ContentPane�� JFrame");
			// frame�� x��ư Ŭ���� �����ϵ��� �⺻�̺�Ʈ ó��
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container contentPane = getContentPane();//������Ʈ ���� ���� ���ϱ�
			contentPane.setBackground(Color.orange);//���� ����
			contentPane.setLayout(new FlowLayout());//��ġ ������ ����
			
			//��ư ������Ʈ ���� �� �߰�
			contentPane.add(new JButton("OK"));
			contentPane.add(new JButton("Cancel"));
			contentPane.add(new JButton("Ignore"));
		
			 //ũ�� ����
			setSize(300,150);
			setVisible(true);
			
	}

	public static void main(String[] args) {
	   new ContentPaneEx();

	}

}
