package ch01;

//�Լ��� �������̽��� �߻�޼ҵ尡 �ϳ��� �����ϴ� �������̽�
@FunctionalInterface//�����Ϸ����� �߻�޼ҵ尡 �ϳ����� �������̽���� �˸�.
public interface MyFunctionalInterface {
	public void method1();
	//public int method2();
	public default int defaultMethod() {return 10;}
	static void staticMethod() {}
}
