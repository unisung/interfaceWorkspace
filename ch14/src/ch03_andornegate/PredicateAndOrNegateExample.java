package ch03_andornegate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2�� ��� �˻�-�������̽��� test()�Լ��� 2�� ����϶� true���� �����ϵ��� ������.
		IntPredicate predicateA =new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value%2==0;
			}
		};
		//���ٽ�
		predicateA=value-> value%2==0;
		
		//3�� ��� �˻�
		IntPredicate predicateB =new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value%3==0;
			}
		};
		//���ٽ�
		predicateB=value->value%3==0;
		
		//���� and()
		IntPredicate predicateAB=predicateA.and(predicateB);//false && true ->false
		boolean result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����Դϱ�?"+result);
		
		//���� or()
		predicateAB=predicateA.or(predicateB);// false || true -> true
		result = predicateAB.test(9);
		System.out.println("9�� 2 �Ǵ� 3�� ����Դϱ�?"+result);
		
		//������ negate()
		predicateAB = predicateA.negate();//  !false ->  true
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���Դϱ�? "+result);
		
		

	}

}
