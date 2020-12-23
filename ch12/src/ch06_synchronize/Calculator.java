package ch06_synchronize;

//공유객체
public class Calculator {
  private int memory;

public int getMemory() {
	return memory;
}
//동기화 처리
//공유객체는 자신을 사용할
//쓰레드의 동기화 처리를 함.
//쓰레드 줄서기
public  synchronized void  setMemory(int memory) {
	//synchronized(this) {
	this.memory = memory;
	//}
	try {
		    Thread.sleep(5000);//2000밀리초간 휴식
	}catch(Exception e) {
		System.out.println(Thread.currentThread().getName()
				                      +":"+this.memory);
	}
}
  

}
