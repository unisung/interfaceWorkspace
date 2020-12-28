package ch02_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores= {92,95,87};
	
	//최대,최소메소드
	public static int maxOrMin(IntBinaryOperator operator) {
		int result=scores[0];
		
		for(int score:scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
	 //최대값 얻기
		int max=maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				if(left >=right) return left;
				else return right;
			}
		});
		//람다식
		max=maxOrMin((left,right)->left>=right?left:right);
		
		System.out.println("최대값 :"+max);
		
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
		System.out.println("최소값 :"+min);
		
		
		
	}
}
