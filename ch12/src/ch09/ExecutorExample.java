package ch09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorExample {
	public static void main(String[] args) throws Exception {
		//������ pool ��ü���� -newFixedThreadPool(����);
		ExecutorService executorService = Executors.newFixedThreadPool(2);//���� ����

		for(int i=0; i<10; i++) {
			//���� �������̽� ����
			Runnable runnable =new Runnable() {
				@Override
				public void run() {
				  //������ �� ���� �� �۾������� ���
					ThreadPoolExecutor threadPoolExecutor=(ThreadPoolExecutor)executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: "+poolSize+"] �۾� ������ �̸�: "+threadName);
					
					//���� �߻�
					int value=Integer.parseInt("��");
				}
			}; 
			
			//������Ǯ�� �۾� ��û
			executorService.execute(runnable);
			//executorService.submit(runnable);
			
			Thread.sleep(10);
		}
		
		
		//������ Ǯ ����
		executorService.shutdown();
	}
}