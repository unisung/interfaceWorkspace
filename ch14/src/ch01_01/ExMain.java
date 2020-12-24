package ch01_01;

public class ExMain {
public static void main(String[] args) {
	 MyFunctionalInterface fi
	 = new MyFunctionalInterface() {
		@Override
		public void method() {
			System.out.println("hello");
		}
	};
	
	fi.method();
	//1. 변수fi타입=오른쪽 객체 타입 이므로 오른쪽객체는 왼쪽객체와 같은 타입임을 jvm이 파악.
	fi=
			//new MyFunctionalInterface() {//인터페이스명 생략
		//2. 인터페이스 내의 추상메소드는 오직 하나이므로 이름 생략.
	  () ->
	//{
			    System.out.println("hello");//3.명령문 하나
	//	}
//	}
;
  fi=()->System.out.println("hello");
  fi.method();
	
}
}
