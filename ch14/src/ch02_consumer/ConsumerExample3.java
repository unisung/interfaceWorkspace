package ch02_consumer;

import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample3 {

	public static void main(String[] args) {
		DoubleConsumer doubleConsumer=new DoubleConsumer() {
			
			@Override
			public void accept(double value) {//double값 
			  System.out.println("자바"+value);
			}
		};
		
		//호출
		doubleConsumer.accept(1.8);//autoBoxing아님-기본타입 
		
		//람다식
		doubleConsumer = value->System.out.println("자바"+value);
		//호출
		doubleConsumer.accept(1.8);
		
		//
		ObjIntConsumer<String> objIntConsumer
		   =new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int v) {
				System.out.println(t+v);
			}
		};
		//호출
		objIntConsumer.accept("자바", 8);
		
		//람다식
		objIntConsumer = (t,v)->System.out.println(t+v);
		objIntConsumer.accept("자바", 8);
	}
	
}
