package ch04_event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//GUI ���α׷� �̺�Ʈ ó��
public class IndependentListener4Ex extends JFrame{
   //������
	public IndependentListener4Ex() throws HeadlessException {
		 setTitle("Action �̺�Ʈ ������ ����");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 //������Ʈ ������ �����̳� ���
		 Container c=getContentPane();
		 c.setLayout(new FlowLayout());//float 
		 //��ư ������Ʈ 
		 JButton btn = new JButton("Hello");
		 
		 //������Ʈ�� �̺�Ʈ ó�� ������ ����
		 btn.addActionListener(new MyActionListener2());
		 
		 //�����̳ʿ� ����
		 c.add(btn);
		 
		 //ȭ�鿡 ���̵��� Frame������ ���� �� visible(true)
		 setSize(350,150);//width, height
		 setVisible(true);
		 
		 
	}

	public static void main(String[] args) {
		 new IndependentListener4Ex();
	}
	
	//�̺�Ʈ ó�� Ŭ����
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {//�̺�Ʈ ��ü�� �Ű������� �޾Ƽ� ó��
			  JButton b = (JButton)e.getSource();//�̺�Ʈ�� �߻��� ������Ʈ Ȯ��
			  if(b.getText().equals("Hello")) 
				  b.setText("�ȳ�");
			  else
				  b.setText("Hello");
		}
	}
}



