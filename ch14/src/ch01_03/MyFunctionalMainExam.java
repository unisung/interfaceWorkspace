package ch01_03;

public class MyFunctionalMainExam {
	public static void main(String[] args) {
		MyFunctionalInterface fi
		  = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return x+y;//return 식,값;
			}
		};
		
		//실행
		int result=fi.method(10, 20);
		System.out.println(result);
		
		fi
		  = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return sum(x,y);//return 다른함수호출();
			}
		};
		
		result=fi.method(10,20);
		System.out.println(result);
		
	}

	public static int sum(int x, int y) {
		return x+y;
	}
}
