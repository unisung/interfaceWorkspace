package ch01_03_absAndInterface2;

public  interface MyInterface {
 default void method1() {System.out.println("hello");}//일반메소드 - 실체{}가 있는 메소드
   void mehtod2();//실체{}가 없는 메소드 -추상메소드 
}
//자식클래스 구현체 
class Child implements MyInterface{
	@Override
	public void mehtod2() {
		
	}
	}
//왼쪽= 오른