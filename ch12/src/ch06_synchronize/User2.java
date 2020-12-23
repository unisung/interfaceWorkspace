package ch06_synchronize;

public class User2  extends Thread{
	 //공유객체 사용
	 private Calculator calculator;
	 
	 public void setCalculator(Calculator calculator) {
			this.setName("User2");
			this.calculator = calculator;
		}

	@Override
	public void run() {
	  calculator.setMemory(50);
	//2초 후 실행(Thread.sleep(2000)에 의해
	  System.out.println(getName()
			  +":"+calculator.getMemory());
	}
	 
	 
}

