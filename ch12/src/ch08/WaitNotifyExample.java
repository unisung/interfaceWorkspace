package ch08;

public class WaitNotifyExample {

	public static void main(String[] args) {
		//���� ��ü ����
		WorkObject shareObject
		  =new WorkObject();
		
//�ΰ��� �����尡 ������ü ����	
ThreaA threadA = new ThreaA(shareObject);
 ThreaB threadB = new ThreaB(shareObject);
    
    //������ ����
    threadA.start();
    threadB.start();
	}
}
