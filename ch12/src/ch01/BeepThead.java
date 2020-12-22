package ch01;

import java.awt.Toolkit;

//Thread클래스를 상속받아서 생성
public class BeepThead extends Thread {

	@Override
	public void run() {
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 for(int i=0;i<5;i++) {
			   toolkit.beep();
			   try {
				      Thread.sleep(500);//500밀리초 간격으로 실향
			   }catch(Exception e) {}
		 }
	}

}
