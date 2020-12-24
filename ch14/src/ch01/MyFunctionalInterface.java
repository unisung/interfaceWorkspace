package ch01;

//함수적 인터페이스는 추상메소드가 하나만 존재하는 인터페이스
@FunctionalInterface//컴파일러에게 추상메소드가 하나뿐인 인터페이스라고 알림.
public interface MyFunctionalInterface {
	public void method1();
	//public int method2();
	public default int defaultMethod() {return 10;}
	static void staticMethod() {}
}
