package ch01_03_absAndInterface2;

public  interface MyInterface {
 default void method1() {System.out.println("hello");}//�Ϲݸ޼ҵ� - ��ü{}�� �ִ� �޼ҵ�
   void mehtod2();//��ü{}�� ���� �޼ҵ� -�߻�޼ҵ� 
}
//�ڽ�Ŭ���� ����ü 
class Child implements MyInterface{
	@Override
	public void mehtod2() {
		
	}
	}
//����= ����