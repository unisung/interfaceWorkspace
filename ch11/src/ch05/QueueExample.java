package ch05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
public static void main(String[] args) {
	Queue queue=new LinkedList();
	 queue.offer(1);//按眉 历厘
	 System.out.println("历厘等 按眉:"+queue.peek());//啊厘 菊俊 历厘等 按眉 犬牢 peek();
	 queue.offer(2);
	 System.out.println("历厘等 按眉:"+queue.peek());
	 queue.offer(3);
	 System.out.println("历厘等 按眉:"+queue.peek());
	 
	 //力芭
	 Integer value=(Integer) queue.poll();//啊厘 菊俊 历厘等 按眉 力芭
	 System.out.println("\n力芭等 按眉:"+value);
	 System.out.println("历厘等 按眉:"+queue.peek());
	 
	 value=(Integer)  queue.poll();
	 System.out.println("力芭等 按眉:"+value);
	 System.out.println("历厘等 按眉:"+queue.peek());
	 
	 value=(Integer)  queue.poll();
	 System.out.println("力芭等 按眉:"+value);
	 queue.poll();
	 System.out.println("历厘等 按眉:"+queue.peek());//null
}
}
