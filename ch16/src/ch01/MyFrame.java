package ch01;

import java.awt.HeadlessException;

import javax.swing.JFrame;

//JFrame - GUI�� ���� �Ʒ� BASE�����̳�
public class MyFrame extends JFrame{
   //������
	public MyFrame() throws HeadlessException {
		setTitle("300x300 ���� ������ �����");
		setSize(300,300);//������ ũ�� ����
		setVisible(true);//ȭ�鿡 ���̱� ó��
	}

	public static void main(String[] args) {
		 new MyFrame();
	}
}
