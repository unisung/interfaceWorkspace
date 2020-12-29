package ch01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() throws HeadlessException {
			setTitle("ContentPane과 JFrame");
			// frame의 x버튼 클릭시 종료하도록 기본이벤트 처리
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container contentPane = getContentPane();//컴포넌트 담을 영역 구하기
			contentPane.setBackground(Color.orange);//배경색 지정
			contentPane.setLayout(new FlowLayout());//배치 지정자 설정
			
			//버튼 컴포넌트 생성 및 추가
			contentPane.add(new JButton("OK"));
			contentPane.add(new JButton("Cancel"));
			contentPane.add(new JButton("Ignore"));
		
			 //크기 조정
			setSize(300,150);
			setVisible(true);
			
	}

	public static void main(String[] args) {
	   new ContentPaneEx();

	}

}
