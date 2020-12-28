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
	//���ٽ�
	functionA=t->t.getAddress();
	functionB=t->t.getCity();
	
	
	//functionA����� �Ű������� �޾Ƽ� functionB���� ó��
	functionAB = functionA.andThen(functionB);
   city=functionAB.apply(new Member("ȫ�浿", "hong",new Address("�ѱ�", "����")));
     System.out.println("���ֵ���:"+city);
   
    //functionA����� �Ű������ι޾Ƽ� functionB���� ó��
     functionAB = functionB.compose(functionA);
     city=functionAB.apply(new Member("ȫ�浿", "hong",new Address("�ѱ�", "����")));
     System.out.println("���� ����:"+city);
     
   
	
	

	}

}
