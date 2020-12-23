package ch09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorExample {
	public static void main(String[] args) throws Exception {
		//쓰레드 pool 객체생성 -newFixedThreadPool(갯수);
		ExecutorService executorService = Executors.newFixedThreadPool(2);//갯수 고정

		for(int i=0; i<10; i++) {
			//무명 인터페이스 선언
			Runnable runnable =new Runnable() {
				@Override
				public void run() {
				  //스레드 총 개수 및 작업스레드 출력
					ThreadPoolExecutor threadPoolExecutor=(ThreadPoolExecutor)executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 갯수: "+poolSize+"] 작업 스레드 이름: "+threadName);
					
					//예외 발생
					int value=Integer.parseInt("삼");
				}
			}; 
			
			//스레드풀에 작업 요청
			executorService.execute(runnable);
			//executorService.submit(runnable);
			
			Thread.sleep(10);
		}
		
		
		//쓰레드 풀 종료
		executorService.shutdown();
	}
}