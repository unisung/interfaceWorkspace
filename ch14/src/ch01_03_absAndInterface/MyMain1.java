package ch01_03_absAndInterface;

public class MyMain1 {
	public static void main(String[] args) {
	//�߻�Ŭ�����̹Ƿ� ��ӹ���
	//�ڽ�Ŭ����(����ü)�� �����Ͽ� ����
		MyAbs ma
		// = new MyAbs();
		=new Child();
		
		//���� �߻�Ŭ���� ��ü ����
		ma=new MyAbs() {		
			@Override
			void mehtod2() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}
