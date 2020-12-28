package ch02_consumer;

import java.util.function.Consumer;

//�Ű������� �ް� ����Ÿ���� ���� void �߻�޼ҵ带 �ϳ��� ������ interface API
public class ConsumerExample {
	public static void main(String[] args) {
		//Consumer
		//�͸���ü�� ����
		Consumer<String> consume = new Consumer<String>() {
			@Override
			public void accept(String t) {//����δ� �����ڰ� ���ϴ� ��ɹ� �ϼ�.
				System.out.println(t+"8");
			}
		};
		//����� �͸���ü�� �޼ҵ� ����
		consume.accept("�ڹ�");
		
		//���ٽ�
		Consumer<String> consume2= t-> System.out.println(t+"8");	
		consume2.accept("�ڹ�");
		
		
		
		
		
	}
}
