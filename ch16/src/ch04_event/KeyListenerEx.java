package ch04_event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//key이벤트 처리
public class KeyListenerEx extends JFrame{
	private JLabel[] keyMessage;

	public KeyListenerEx() {
     setTitle("KeyListener 예제");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     //컨테이너 얻기
     Container c= getContentPane();
     //배치관리자 설정
     c.setLayout(new FlowLayout());
     
     //컨테이너에 이벤트처리 리스너 부착
     c.addKeyListener(new MyKeyListener()); 
     
     keyMessage=new JLabel[3];
     keyMessage[0]=new JLabel("getKeyCode()");
     keyMessage[1]=new JLabel("getKeyChar()");
     keyMessage[2]=new JLabel("getKeyText()");
     
     for(int i=0;i<keyMessage.length;i++) {
    	 //컨테이너에 컴포넌트 붙이기
    	 c.add(keyMessage[i]);
    	 keyMessage[i].setOpaque(true);//투명처리
    	 keyMessage[i].setBackground(Color.YELLOW);
     }
     //화면에 보이기
     setSize(new Dimension(300, 150));
     setVisible(true);
     
     //자동 focus 받도록 처리
     c.setFocusable(true);
     c.requestFocus();
	}

//이벤트 리스너
class MyKeyListener extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();//VK값
      char keyChar = e.getKeyChar();//unicode값
      
      keyMessage[0].setText(Integer.toString(keyCode));
      keyMessage[1].setText(Character.toString(keyChar));
      keyMessage[2].setText(e.getKeyText(keyCode));
	}
}

	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
