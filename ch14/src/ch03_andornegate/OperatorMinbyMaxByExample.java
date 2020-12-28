package ch03_andornegate;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class OperatorMinbyMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		// Comparator<? super T> comparator - <? super T> <- <>에 올수 있는 타입은 T를 포함한 T의 부모타입 모두 올수 있음
		binaryOperator = BinaryOperator.minBy(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {//순서적으로 작은값이 먼저 정렬되도록 수정
				//return o1.getPrice()-o2.getPrice();//양,0,음
				return Integer.compare(o1.getPrice(), o2.getPrice());
			}
		});
		
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박",10000));
		System.out.println(fruit.getName());
		
       //람다식
		binaryOperator = BinaryOperator.maxBy( (o1,  o2) ->o1.getPrice()-o2.getPrice());//양,0,음
		
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박",10000));
		System.out.println(fruit.getName());
	}

}
