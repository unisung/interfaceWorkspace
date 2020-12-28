package ch02_supplier;

import java.util.function.IntSupplier;

//supplier 함수적 인터페이스
//매개변수를 받지 않고 리턴타입만 있는 추상메소드를 가진 인터페이스
public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier
		   = new IntSupplier() {
			@Override
			public int getAsInt() {//매개변수 없고, int타입 값 리턴
				return (int)(Math.random()*6) +1;//정수 값 리턴(1~6 무작위 정수)
			}
		};
		//호출
		int result=intSupplier.getAsInt();
		System.out.println("주사위 눈: "+result);
	   
		//람다식
		intSupplier = ()-> (int)(Math.random()*6)+1;
		//호출
		result = intSupplier.getAsInt();
		System.out.println("주사위 눈: "+result);

	}
}
