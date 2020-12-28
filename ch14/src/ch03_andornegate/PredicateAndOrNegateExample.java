package ch03_andornegate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2의 배수 검사-인터페이스의 test()함수를 2의 배수일때 true값을 리턴하도록 재정의.
		IntPredicate predicateA =new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value%2==0;
			}
		};
		//람다식
		predicateA=value-> value%2==0;
		
		//3의 배수 검사
		IntPredicate predicateB =new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value%3==0;
			}
		};
		//람다식
		predicateB=value->value%3==0;
		
		//논리곱 and()
		IntPredicate predicateAB=predicateA.and(predicateB);//false && true ->false
		boolean result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까?"+result);
		
		//논리합 or()
		predicateAB=predicateA.or(predicateB);// false || true -> true
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까?"+result);
		
		//논리부정 negate()
		predicateAB = predicateA.negate();//  !false ->  true
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? "+result);
		
		

	}

}
