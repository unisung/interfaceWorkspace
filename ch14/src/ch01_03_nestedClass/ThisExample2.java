package ch01_03_nestedClass;

public class ThisExample2 {
	public int field1=10;
	
	//��øŬ����
	class Inner{
		int field2=20;
	//	{}
	//	if(true) {}
	//	while(ture) {}
		
		void method() {
			 //���ٽ�
			MyFunctInterface fi
			 = () -> {
					System.out.println("�ٱ���Ŭ���� �ʵ�: "+field1);
					System.out.println("�ٱ���Ŭ���� �ʵ�: "+ThisExample2.this.field1);//
					
					System.out.println("����Ŭ���� �ʵ�: "+field2);
					//�����������̽� ��ü �������� this.���� Ŭ���� �ʵ�� ���� �Ұ� 
					System.out.println("����Ŭ���� �ʵ�: "+this.field2);//���ٽ����δ� this.����Ŭ�����ʵ�� ���� ����
				}
			;

			fi.method();
			
		}
		
	}

}
