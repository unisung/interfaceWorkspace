package ch02_consumer;

import java.util.function.BiConsumer;

//consumer�������̽�
public class ConsumerExample2 {
	public static void main(String[] args) {
		//����� ���׸��κп� Ÿ�� ����<>
	 BiConsumer<String,Integer> biConsumer=new BiConsumer<String, Integer>() {
		@Override
		public void accept(String t, Integer u) {
		   System.out.println(t+u);//StringŸ�� + IntegerŸ�� ->StringŸ��
		}
	};//biConsumer ���� ���� ��.
	biConsumer.accept("�ڹ�", 8);//intŸ��8 ->IntegerŸ��8�� autoBoxing
	
	//���ٽ�
	biConsumer = (t,u)->System.out.println(t+u);
	biConsumer.accept("�ڹ�", 8);
	
	//<T,T> ���� Ÿ���� �ü� �ֽ�.
	BiConsumer<String, String> biConsumer2 = new BiConsumer<String, String>() {
		@Override
		public void accept(String t, String u) {
			System.out.println(t+u);
		}
	};
	
	biConsumer2.accept("�ڹ�", "8");
	
	//���ٽ�
	biConsumer2=(t,u)->System.out.println(t+u);
	biConsumer2.accept("�ڹ�", "8");

	}

}
