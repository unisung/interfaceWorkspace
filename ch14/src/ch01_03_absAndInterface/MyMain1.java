package ch01_03_absAndInterface;

public class MyMain1 {
	public static void main(String[] args) {
	//추상클래스이므로 상속받은
	//자식클래스(구현체)로 생성하여 대입
		MyAbs ma
		// = new MyAbs();
		=new Child();
		
		//무명 추상클래스 객체 생성
		ma=new MyAbs() {		
			@Override
			void mehtod2() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}
