package ch02_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores= {92,95,87};
	
	//�ִ�,�ּҸ޼ҵ�
	public static int maxOrMin(IntBinaryOperator operator) {
		int result=scores[0];
		
		for(int score:scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
	 //�ִ밪 ���
		int max=maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				if(left >=right) return left;
				else return right;
			}
		});
		//���ٽ�
		max=maxOrMin((left,right)->left>=right?left:right);
		
		System.out.println("�ִ밪 :"+max);
		
		int min=maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				if(left>=right) return right;
				else return left;
			}
		});
	   min = maxOrMin((left,right)->{
			if(left>=right) return right;
			else return left;
		});
		System.out.println("�ּҰ� :"+min);
		
		
		
	}
}
