package ch03_reference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public static void main(String[] args) {
      IntBinaryOperator operator;
      
      //정적메소드 참조
      operator = new IntBinaryOperator() {
		@Override
		public int applyAsInt(int left, int right) {
			return Calculator.staticMethod(left,right);//정적메소드 호출
		}
	};
	//람다식
	operator=(left,right)->Calculator.staticMethod(left,right);
	System.out.println(operator.applyAsInt(10, 20));
	
	//static메소드 참조
	operator = Calculator::staticMethod;//jvm이 메소드의 매개변수타입, 리턴타입 파악
	System.out.println(operator.applyAsInt(10, 20));
	
	//인스턴스메소드 참조
	//메소드가 오버로딩 되어있으면
	//넘겨진 매개변수의 타입,수에 맞도록 jvm이 찾아서 실행.
	Calculator cal = new Calculator();//인스턴스 객체
	operator = new IntBinaryOperator() {
		@Override
		public int applyAsInt(int left, int right) {
			return cal.instanceMethod(left, right);
		}
	};
	
	System.out.println(operator.applyAsInt(10, 20));
	//람다식
	operator=(left,right)->cal.instanceMethod(left, right);
	
	//인스턴스 메소드 참조 - 참조변수::인스턴스메소드명
	//메소드가 오버로딩 되어있으면
	//넘겨진 매개변수의 타입,수에 맞도록 jvm이 찾아서 실행.
	operator=cal::instanceMethod;
	System.out.println(operator.applyAsInt(10, 20));
	
	
	
      

	}
}
