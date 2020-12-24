package ch01_02;

public class ExMain {
public static void main(String[] args) {
	 MyFunctionalInterface fi
	 = new MyFunctionalInterface() {
		@Override
		public void method(int x) {
			System.out.println(x);
		}
	};
	
	fi.method(10);
	
	//람다식
	fi=
			//new MyFunctionalInterface() {
		   x // 매개변수 부분에 매개변수가 하나 있으면 괄호 생략 가능()
		   -> //매개변수의 타입 알고있음. 타입 제거, 선언부()와 실행부 사이 {} 화살표 표시 -> 
	      //{ 
			System.out.println(x);//명령문 하나, 중괄호 생략 가능
		//}
//	}
;
 //람다식
 fi=x->System.out.println(x);
	
 fi.method(10);
 
 
 
}
}
