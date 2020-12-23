package ch05;

public class StartThreadEx {
//쓰레드 우선 순위
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread"+i);
			//생성시의 thread의 우선순위 5
			System.out.println("생성시 우선순위:"+thread.getPriority());//우선순위 출력
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);//우선순위 1
				System.out.println("현재 우선순위:"+thread.getPriority());//우선순위 설정 
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);//우선순위10
				System.out.println("현재 우선순위:"+thread.getPriority());
			}
			//jvm에 요청-쓰레드 대기줄에 등록
			thread.start();
		}
	}

}
//Thread클래스를 상속받은 클래스
class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	//Thread에서 실행할 내용
	@Override
	public void run() {
	 for(int i=0;i<20000000;i++) {}//Thread.sleep가 비슷한 효과 
	 System.out.println(getName());//메소드명 출력
	}
	
	
}