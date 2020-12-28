package ch02_consumer;

import java.util.function.BiConsumer;

//consumer인터페이스
public class ConsumerExample2 {
	public static void main(String[] args) {
		//선언시 제네리부분에 타입 지정<>
	 BiConsumer<String,Integer> biConsumer=new BiConsumer<String, Integer>() {
		@Override
		public void accept(String t, Integer u) {
		   System.out.println(t+u);//String타입 + Integer타입 ->String타입
		}
	};//biConsumer 변수 선언 끝.
	biConsumer.accept("자바", 8);//int타입8 ->Integer타입8로 autoBoxing
	
	//람다식
	biConsumer = (t,u)->System.out.println(t+u);
	biConsumer.accept("자바", 8);
	
	//<T,T> 같은 타입이 올수 있슴.
	BiConsumer<String, String> biConsumer2 = new BiConsumer<String, String>() {
		@Override
		public void accept(String t, String u) {
			System.out.println(t+u);
		}
	};
	
	biConsumer2.accept("자바", "8");
	
	//람다식
	biConsumer2=(t,u)->System.out.println(t+u);
	biConsumer2.accept("자바", "8");

	}

}
