package ch01;

import java.awt.Toolkit;
//Runnale�������̽� ����
public class BeepTask implements Runnable{
	
	@Override
	public void run() {
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 for(int i=0;i<5;i++) {
			   toolkit.beep();
			   try {
				      Thread.sleep(500);//500�и��� �������� ����
			   }catch(Exception e) {}
		 }
	}
}