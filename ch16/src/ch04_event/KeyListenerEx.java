package ch04_event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//key�̺�Ʈ ó��
public class KeyListenerEx extends JFrame{
	private JLabel[] keyMessage;

	public KeyListenerEx() {
     setTitle("KeyListener ����");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     //�����̳� ���
     Container c= getContentPane();
     //��ġ������ ����
     c.setLayout(new FlowLayout());
     
     //�����̳ʿ� �̺�Ʈó�� ������ ����
     c.addKeyListener(new MyKeyListener()); 
     
     keyMessage=new JLabel[3];
     keyMessage[0]=new JLabel("getKeyCode()");
     keyMessage[1]=new JLabel("getKeyChar()");
     keyMessage[2]=new JLabel("getKeyText()");
     
     for(int i=0;i<keyMessage.length;i++) {
    	 //�����̳ʿ� ������Ʈ ���̱�
    	 c.add(keyMessage[i]);
    	 keyMessage[i].setOpaque(true);//����ó��
    	 keyMessage[i].setBackground(Color.YELLOW);
     }
     //ȭ�鿡 ���̱�
     setSize(new Dimension(300, 150));
     setVisible(true);
     
     //�ڵ� focus �޵��� ó��
     c.setFocusable(true);
     c.requestFocus();
	}

//�̺�Ʈ ������
class MyKeyListener extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();//VK��
      char keyChar = e.getKeyChar();//unicode��
      
      keyMessage[0].setText(Integer.toString(keyCode));
      keyMessage[1].setText(Character.toString(keyChar));
      keyMessage[2].setText(e.getKeyText(keyCode));
	}
}

	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
