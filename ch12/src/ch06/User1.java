package ch06;

public class User1 
           extends Thread{
 //공유객체 사용
 private Calculator calculator;

public void setCalculator(Calculator calculator) {
	this.setName("User1");
	this.calculator = calculator;
}

//run메소드 재정의
@Override
public void run() {
	calculator.setMemory(100);
	//2초 후 실행(Thread.sleep(2000)에 의해
	System.out.println(getName()
			 +":"+calculator.getMemory());
}

}
