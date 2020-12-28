package ch02_consumer;

import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample3 {

	public static void main(String[] args) {
		DoubleConsumer doubleConsumer=new DoubleConsumer() {
			
			@Override
			public void accept(double value) {//double�� 
			  System.out.println("�ڹ�"+value);
			}
		};
		
		//ȣ��
		doubleConsumer.accept(1.8);//autoBoxing�ƴ�-�⺻Ÿ�� 
		
		//���ٽ�
		doubleConsumer = value->System.out.println("�ڹ�"+value);
		//ȣ��
		doubleConsumer.accept(1.8);
		
		//
		ObjIntConsumer<String> objIntConsumer
		   =new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int v) {
				System.out.println(t+v);
			}
		};
		//ȣ��
		objIntConsumer.accept("�ڹ�", 8);
		
		//���ٽ�
		objIntConsumer = (t,v)->System.out.println(t+v);
		objIntConsumer.accept("�ڹ�", 8);
	}
	
}
