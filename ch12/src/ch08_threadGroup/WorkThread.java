package ch08_threadGroup;

public class WorkThread extends Thread{

	//쓰레드 그룹명을 지정해서 생성
	public WorkThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
	  while(true) {
		  try {
			     Thread.sleep(1000);//1000밀리초간 정지
		  }catch(Exception e) {
			   System.out.println(getName()+" interrupted");
			   break;
		  }
	  }
	  
	  System.out.println(getName() +" 종료됨");
	}
	
	
	

}
