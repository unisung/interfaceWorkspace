package ch04_event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

//GUI ���α׷� �̺�Ʈ ó��
public class IndependentListener2Ex extends JFrame{
   //������
	public IndependentListener2Ex() throws HeadlessException {
		 setTitle("Action �̺�Ʈ ������ ����");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 //������Ʈ ������ �����̳� ���
		 Container c=getContentPane();
		 c.setLayout(new FlowLayout());//float 
		 //��ư ������Ʈ 
		 JButton btn = new JButton("Hello");
		 
		 //������Ʈ�� �̺�Ʈ ó�� ������ ����
		 
		 //�����̳ʿ� ����
		 c.add(btn);
		 
		 //ȭ�鿡 ���̵��� Frame������ ���� �� visible(true)
		 setSize(350,150);//width, height
		 setVisible(true);
		 
		 
	}

	public static void main(String[] args) {
		 new IndependentListener2Ex();
	}
}
