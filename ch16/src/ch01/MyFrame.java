package ch01;

import java.awt.HeadlessException;

import javax.swing.JFrame;

//JFrame - GUI의 가장 아래 BASE컨테이너
public class MyFrame extends JFrame{
   //생성자
	public MyFrame() throws HeadlessException {
		setTitle("300x300 스위 프레임 만들기");
		setSize(300,300);//프레임 크기 설정
		setVisible(true);//화면에 보이기 처리
	}

	public static void main(String[] args) {
		 new MyFrame();
	}
}
