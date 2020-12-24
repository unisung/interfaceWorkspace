package ch01_03_absAndInterface2;

public class MyMain1 {
	public static void main(String[] args) {
	//추상클래스이므로 상속받은
	//자식클래스(구현체)로 생성하여 대입
		MyInterface mi
		//= new MyInterface();
		=new Child();//대입시 프로모션되어 부모타입으로 대입
		
		//무명 추상클래스 객체 생성
		mi=()-> {
				// TODO Auto-generated method stub
                System.out.println("실행문");				
			}
		;
		
	}
}
