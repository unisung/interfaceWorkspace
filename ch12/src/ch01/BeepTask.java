package ch01;

import java.awt.Toolkit;
//Runnale인터페이스 구현
public class BeepTask implements Runnable{
	
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