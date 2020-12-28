package ch02_consumer;

import java.util.function.Consumer;

//매개변수를 받고 리턴타입이 없는 void 추상메소드를 하나만 가지는 interface API
public class ConsumerExample {
	public static void main(String[] args) {
		//Consumer
		//익명구현체로 대입
		Consumer<String> consume = new Consumer<String>() {
			@Override
			public void accept(String t) {//실행부는 개발자가 원하는 명령문 완성.
				System.out.println(t+"8");
			}
		};
		//선언된 익명구현체의 메소드 실행
		consume.accept("자바");
		
		//람다식
		Consumer<String> consume2= t-> System.out.println(t+"8");	
		consume2.accept("자바");
		
		
		
		
		
	}
}
