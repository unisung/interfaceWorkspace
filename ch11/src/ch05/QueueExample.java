package ch05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
public static void main(String[] args) {
	Queue queue=new LinkedList();
	 queue.offer(1);//��ü ����
	 System.out.println("����� ��ü:"+queue.peek());//���� �տ� ����� ��ü Ȯ�� peek();
	 queue.offer(2);
	 System.out.println("����� ��ü:"+queue.peek());
	 queue.offer(3);
	 System.out.println("����� ��ü:"+queue.peek());
	 
	 //����
	 Integer value=(Integer) queue.poll();//���� �տ� ����� ��ü ����
	 System.out.println("\n���ŵ� ��ü:"+value);
	 System.out.println("����� ��ü:"+queue.peek());
	 
	 value=(Integer)  queue.poll();
	 System.out.println("���ŵ� ��ü:"+value);
	 System.out.println("����� ��ü:"+queue.peek());
	 
	 value=(Integer)  queue.poll();
	 System.out.println("���ŵ� ��ü:"+value);
	 queue.poll();
	 System.out.println("����� ��ü:"+queue.peek());//null
}
}
