package ch01_03_absAndInterface;

public  abstract class MyAbs {
  void method1() {System.out.println("hello");}//�Ϲݸ޼ҵ� - ��ü{}�� �ִ� �޼ҵ�
  abstract void mehtod2();//��ü{}�� ���� �޼ҵ� -�߻�޼ҵ� 
}
//�ڽ�Ŭ����
class Child extends MyAbs{
	@Override
	void mehtod2() {
		
	}
	}