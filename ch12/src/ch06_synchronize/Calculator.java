package ch06_synchronize;

//������ü
public class Calculator {
  private int memory;

public int getMemory() {
	return memory;
}
//����ȭ ó��
//������ü�� �ڽ��� �����
//�������� ����ȭ ó���� ��.
//������ �ټ���
public  synchronized void  setMemory(int memory) {
	//synchronized(this) {
	this.memory = memory;
	//}
	try {
		    Thread.sleep(5000);//2000�и��ʰ� �޽�
	}catch(Exception e) {
		System.out.println(Thread.currentThread().getName()
				                      +":"+this.memory);
	}
}
  

}
