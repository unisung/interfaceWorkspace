package ch08;

public class JoinExample {

	//main������
	public static void main(String[] args) {
		//SumThreadȣ��
	 SumThread sumThread=new SumThread();
	 sumThread.start();
	 
	 try {
		    sumThread.join();//ȣ��� �������� ó�� ����� ���ö� ���� ��ٸ�
	 }catch(Exception e) {}
	 
	 System.out.println("1~100������ ��: "+sumThread.getSum());

	}

}
