package ch01_03;

public class MyFunctionalMainExam2 {
	public static void main(String[] args) {
		//���ٽ�
		MyFunctionalInterface fi =( x,  y) ->x+y;//return ��,��;
		
		//����
		int result=fi.method(10, 20);
		System.out.println(result);
		
		//���ٽ�
		fi  = (x,y) -> sum(x,y);//return �ٸ��Լ�ȣ��();
		
		result=fi.method(10,20);
		System.out.println(result);
		
	}

	public static int sum(int x, int y) {
		return x+y;
	}
}
