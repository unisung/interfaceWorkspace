package ch06;

//������ü
public class Calculator {
  private int memory;

public int getMemory() {
	return memory;
}

public void setMemory(int memory) {
	this.memory = memory;
	try {
		    Thread.sleep(2000);//2000�и��ʰ� �޽�
	}catch(Exception e) {
		System.out.println(Thread.currentThread().getName()
				                      +":"+this.memory);
	}
}
  

}
