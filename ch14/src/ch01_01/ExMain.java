package ch01_01;

public class ExMain {
public static void main(String[] args) {
	 MyFunctionalInterface fi
	 = new MyFunctionalInterface() {
		@Override
		public void method() {
			System.out.println("hello");
		}
	};
	
	fi.method();
	//1. ����fiŸ��=������ ��ü Ÿ�� �̹Ƿ� �����ʰ�ü�� ���ʰ�ü�� ���� Ÿ������ jvm�� �ľ�.
	fi=
			//new MyFunctionalInterface() {//�������̽��� ����
		//2. �������̽� ���� �߻�޼ҵ�� ���� �ϳ��̹Ƿ� �̸� ����.
	  () ->
	//{
			    System.out.println("hello");//3.��ɹ� �ϳ�
	//	}
//	}
;
  fi=()->System.out.println("hello");
  fi.method();
	
}
}
