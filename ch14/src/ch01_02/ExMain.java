package ch01_02;

public class ExMain {
public static void main(String[] args) {
	 MyFunctionalInterface fi
	 = new MyFunctionalInterface() {
		@Override
		public void method(int x) {
			System.out.println(x);
		}
	};
	
	fi.method(10);
	
	//���ٽ�
	fi=
			//new MyFunctionalInterface() {
		   x // �Ű����� �κп� �Ű������� �ϳ� ������ ��ȣ ���� ����()
		   -> //�Ű������� Ÿ�� �˰�����. Ÿ�� ����, �����()�� ����� ���� {} ȭ��ǥ ǥ�� -> 
	      //{ 
			System.out.println(x);//��ɹ� �ϳ�, �߰�ȣ ���� ����
		//}
//	}
;
 //���ٽ�
 fi=x->System.out.println(x);
	
 fi.method(10);
 
 
 
}
}
