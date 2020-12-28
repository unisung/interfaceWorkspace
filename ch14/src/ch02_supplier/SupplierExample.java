package ch02_supplier;

import java.util.function.IntSupplier;

//supplier �Լ��� �������̽�
//�Ű������� ���� �ʰ� ����Ÿ�Ը� �ִ� �߻�޼ҵ带 ���� �������̽�
public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier
		   = new IntSupplier() {
			@Override
			public int getAsInt() {//�Ű����� ����, intŸ�� �� ����
				return (int)(Math.random()*6) +1;//���� �� ����(1~6 ������ ����)
			}
		};
		//ȣ��
		int result=intSupplier.getAsInt();
		System.out.println("�ֻ��� ��: "+result);
	   
		//���ٽ�
		intSupplier = ()-> (int)(Math.random()*6)+1;
		//ȣ��
		result = intSupplier.getAsInt();
		System.out.println("�ֻ��� ��: "+result);

	}
}
