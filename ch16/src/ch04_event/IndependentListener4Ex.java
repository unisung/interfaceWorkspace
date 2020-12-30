package ch04_event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//GUI 프로그램 이벤트 처리
public class IndependentListener4Ex extends JFrame{
   //생성자
	public IndependentListener4Ex() throws HeadlessException {
		 setTitle("Action 이벤트 리스너 예제");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 //컴포넌트 부착할 컨텐이너 얻기
		 Container c=getContentPane();
		 c.setLayout(new FlowLayout());//float 
		 //버튼 컴포넌트 
		 JButton btn = new JButton("Hello");
		 
		 //컴포넌트에 이벤트 처리 리스너 부착
		 btn.addActionListener(new MyActionListener2());
		 
		 //컨테이너에 부착
		 c.add(btn);
		 
		 //화면에 보이도록 Frame사이즈 조절 및 visible(true)
		 setSize(350,150);//width, height
		 setVisible(true);
		 
		 
	}

	public static void main(String[] args) {
		 new IndependentListener4Ex();
	}
	
	//이벤트 처리 클래스
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {//이벤트 객체를 매개변수로 받아서 처리
			  JButton b = (JButton)e.getSource();//이벤트가 발생한 컴포넌트 확인
			  if(b.getText().equals("Hello")) 
				  b.setText("안녕");
			  else
				  b.setText("Hello");
		}
	}
}



