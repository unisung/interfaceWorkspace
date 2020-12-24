package ch01_03;

public class MyFunctionalMainExam2 {
	public static void main(String[] args) {
		//람다식
		MyFunctionalInterface fi =( x,  y) ->x+y;//return 식,값;
		
		//실행
		int result=fi.method(10, 20);
		System.out.println(result);
		
		//람다식
		fi  = (x,y) -> sum(x,y);//return 다른함수호출();
		
		result=fi.method(10,20);
		System.out.println(result);
		
	}

	public static int sum(int x, int y) {
		return x+y;
	}
}
