package ch01_03_nestedClass;

public class ThisExample {
	public int field1=10;
	
	//��øŬ����
	class Inner{
		int field2=20;
		
		void method() {
			 //���ٽ�
			MyFunctInterface fi
			 = new MyFunctInterface() {
				
				@Override
				public void method() {
					System.out.println("�ٱ���Ŭ���� �ʵ�: "+field1);
					System.out.println("�ٱ���Ŭ���� �ʵ�: "+ThisExample.this.field1);//
					
					System.out.println("����Ŭ���� �ʵ�: "+field2);
					//�����������̽� ��ü �������� this.���� Ŭ���� �ʵ�� ���� �Ұ� 
					//System.out.println("����Ŭ���� �ʵ�: "+this.field2);//�����������̽����� this�� �����������̽� �ڽ��� ����Ŵ(InnerŬ������ ����Ű�°��� �ƴ�)
				}
			};

			fi.method();
			
		}
		
	}

}
