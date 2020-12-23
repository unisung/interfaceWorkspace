package ch06;

//공유객체
public class Calculator {
  private int memory;

public int getMemory() {
	return memory;
}

public void setMemory(int memory) {
	this.memory = memory;
	try {
		    Thread.sleep(2000);//2000밀리초간 휴식
	}catch(Exception e) {
		System.out.println(Thread.currentThread().getName()
				                      +":"+this.memory);
	}
}
  

}
