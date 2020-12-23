package ch08_threadGroup;

public class WorkThread extends Thread{

	//������ �׷���� �����ؼ� ����
	public WorkThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
	  while(true) {
		  try {
			     Thread.sleep(1000);//1000�и��ʰ� ����
		  }catch(Exception e) {
			   System.out.println(getName()+" interrupted");
			   break;
		  }
	  }
	  
	  System.out.println(getName() +" �����");
	}
	
	
	

}
