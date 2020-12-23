package ch08_threadGroup;

public class ThreadGroupExample {

	public static void main(String[] args) {
	//쓰레드 그룹 생성
      ThreadGroup myGroup = new ThreadGroup("myGroup");
      
      //myGroup에 속한 쓰레드 
      WorkThread workThreadA 
             = new WorkThread(myGroup, "workThreadA");
      WorkThread workThreadB 
            = new WorkThread(myGroup, "workThreadB");
      
      workThreadA.start();
      workThreadB.start();
      
      System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
      ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
      
      mainGroup.list();//
      System.out.println();
      
      try {
    	    Thread.sleep(3000);//3초간 정지
      }catch(Exception e) {}
      
      System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출]");
      myGroup.interrupt();//그룹단위로 interrupt()메소드 호출
      
      
	}

}
