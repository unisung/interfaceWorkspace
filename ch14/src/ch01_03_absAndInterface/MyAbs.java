package ch01_03_absAndInterface;

public  abstract class MyAbs {
  void method1() {System.out.println("hello");}//일반메소드 - 실체{}가 있는 메소드
  abstract void mehtod2();//실체{}가 없는 메소드 -추상메소드 
}
//자식클래스
class Child extends MyAbs{
	@Override
	void mehtod2() {
		
	}
	}