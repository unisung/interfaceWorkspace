package ch03_andornegate;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class OperatorMinbyMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		// Comparator<? super T> comparator - <? super T> <- <>�� �ü� �ִ� Ÿ���� T�� ������ T�� �θ�Ÿ�� ��� �ü� ����
		binaryOperator = BinaryOperator.minBy(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {//���������� �������� ���� ���ĵǵ��� ����
				//return o1.getPrice()-o2.getPrice();//��,0,��
				return Integer.compare(o1.getPrice(), o2.getPrice());
			}
		});
		
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����",10000));
		System.out.println(fruit.getName());
		
       //���ٽ�
		binaryOperator = BinaryOperator.maxBy( (o1,  o2) ->o1.getPrice()-o2.getPrice());//��,0,��
		
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����",10000));
		System.out.println(fruit.getName());
	}

}
