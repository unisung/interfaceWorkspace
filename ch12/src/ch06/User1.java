package ch06;

public class User1 
           extends Thread{
 //������ü ���
 private Calculator calculator;

public void setCalculator(Calculator calculator) {
	this.setName("User1");
	this.calculator = calculator;
}

//run�޼ҵ� ������
@Override
public void run() {
	calculator.setMemory(100);
	//2�� �� ����(Thread.sleep(2000)�� ����
	System.out.println(getName()
			 +":"+calculator.getMemory());
}

}
