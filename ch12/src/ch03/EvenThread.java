package ch03;

public class EvenThread implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 20; i++)
		{
			if(i%2 == 0 )
				System.out.println(i + "´Â Â¦¼ö");
		}
	}
}
