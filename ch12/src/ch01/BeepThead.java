package ch01;

import java.awt.Toolkit;

//ThreadŬ������ ��ӹ޾Ƽ� ����
public class BeepThead extends Thread {

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
