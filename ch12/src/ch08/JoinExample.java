package ch08;

public class JoinExample {

	//main쓰레드
	public static void main(String[] args) {
		//SumThread호출
	 SumThread sumThread=new SumThread();
	 sumThread.start();
	 
	 try {
		    sumThread.join();//호출된 쓰레드의 처리 결과가 나올때 까지 기다림
	 }catch(Exception e) {}
	 
	 System.out.println("1~100까지의 합: "+sumThread.getSum());

	}

}
