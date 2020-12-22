package ch01;

import java.awt.Toolkit;
public class BeepPrintExample {
public static void main(String[] args) {
	//싱글 쓰레드 방식 
	//beep() 반복문 종료 후
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 for(int i=0;i<5;i++) {
		   toolkit.beep();
		   try {
			      Thread.sleep(500);//500밀리초 간격으로 실향
		   }catch(Exception e) {}
	 }
	 
	 //print()문 실행
	 for(int i=0;i<5;i++) {
		 System.out.println("띵");
		 try {
			 Thread.sleep(500);
		 }catch(Exception e) {}
	 }
	}//main()끝.

}
