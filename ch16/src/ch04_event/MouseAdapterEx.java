package ch04_event;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

//Adapter�� Listener�� ����ü�� ���� Ŭ����
public class MouseAdapterEx extends JFrame{
    private JLabel la = new JLabel("Hello");

	public MouseAdapterEx() throws HeadlessException {
		setTitle("Mouse�̺�Ʈ ����");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//�̺�Ʈ ��� �߰�
		c.addMouseListener(new MyMouseAdapter(la));
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
}

class MyMouseAdapter extends MouseAdapter{
	 private JLabel la;

	public MyMouseAdapter(JLabel la) {
		this.la = la;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		la.setLocation(x,y);
	}
}
