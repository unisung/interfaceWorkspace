package ch06_synchronize;

public class User2  extends Thread{
	 //������ü ���
	 private Calculator calculator;
	 
	 public void setCalculator(Calculator calculator) {
			this.setName("User2");
			this.calculator = calculator;
		}

	@Override
	public void run() {
	  calculator.setMemory(50);
	//2�� �� ����(Thread.sleep(2000)�� ����
	  System.out.println(getName()
			  +":"+calculator.getMemory());
	}
	 
	 
}

