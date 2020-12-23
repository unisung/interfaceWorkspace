package ch08_threadGroup;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}

	@Override
	public void run() {
	   while(true) {
		   try {
			         Thread.sleep(1000);//1초간격을 실행
		   }catch(InterruptedException e) {
			    break;//종료
		   }
		   save();//save메소드 호출
	   }
	}
	
	

}
