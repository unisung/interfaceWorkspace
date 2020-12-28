package ch03_reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
	   Function<String, Member> function1 = new Function<String, Member>() {
		@Override
		public Member apply(String t) {
			return new Member(t);
		}
	};
	
	//람다식
	function1 = t->new Member(t);
	//람다-생성자 참조 클래스::new; -jvm이 매개변수 시그니처에 맞는 생성자 호출
	function1=Member::new;
	
	BiFunction<String, String, Member> function2=new BiFunction<String, String, Member>() {
		@Override
		public Member apply(String t, String u) {
			return new Member(t,u);
		}
	};
	
	//람다식
    function2 = (t,u)->new Member(t,u);
    //람다-생성자 참조 클래스::new -jvm이 매개변수 시그니처에 맞는 생성자 호출
    function2=Member::new;

	}

}
