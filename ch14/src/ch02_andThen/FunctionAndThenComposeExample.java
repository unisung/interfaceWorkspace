package ch02_andThen;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
	Function<Member, Address> functionA;
	Function<Address,String> functionB;
	Function<Member,String> functionAB;
	
	String city;
	
	functionA=new Function<Member, Address>() {
		@Override
		public Address apply(Member t) {
			return t.getAddress();
		}
	};
	functionB = new Function<Address, String>() {
		@Override
		public String apply(Address t) {
			return t.getCity();
		}
	};
	//람다식
	functionA=t->t.getAddress();
	functionB=t->t.getCity();
	
	
	//functionA결과를 매개변수로 받아서 functionB에서 처리
	functionAB = functionA.andThen(functionB);
   city=functionAB.apply(new Member("홍길동", "hong",new Address("한국", "서울")));
     System.out.println("거주도시:"+city);
   
    //functionA결과를 매개변수로받아서 functionB에서 처리
     functionAB = functionB.compose(functionA);
     city=functionAB.apply(new Member("홍길동", "hong",new Address("한국", "서울")));
     System.out.println("거주 도시:"+city);
     
   
	
	

	}

}
