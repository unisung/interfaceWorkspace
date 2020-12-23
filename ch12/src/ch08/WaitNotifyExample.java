package ch08;

public class WaitNotifyExample {

	public static void main(String[] args) {
		//공유 객체 생성
		WorkObject shareObject
		  =new WorkObject();
		
//두개의 쓰레드가 공유객체 공유	
ThreaA threadA = new ThreaA(shareObject);
 ThreaB threadB = new ThreaB(shareObject);
    
    //쓰레드 실행
    threadA.start();
    threadB.start();
	}
}
