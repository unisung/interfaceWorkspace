package ch01;

import java.awt.Toolkit;
public class BeepPrintExample {
public static void main(String[] args) {
	//�̱� ������ ��� 
	//beep() �ݺ��� ���� ��
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 for(int i=0;i<5;i++) {
		   toolkit.beep();
		   try {
			      Thread.sleep(500);//500�и��� �������� ����
		   }catch(Exception e) {}
	 }
	 
	 //print()�� ����
	 for(int i=0;i<5;i++) {
		 System.out.println("��");
		 try {
			 Thread.sleep(500);
		 }catch(Exception e) {}
	 }
	}//main()��.

}
