package ch03;

public class OddThread extends Thread{
	public void run()
	{
		for(int i = 1; i <= 20; i++)
		{
			if(i%2 != 0)
				System.out.println(i + "´Â È¦¼ö");
		}
	}
}
