package ch08;

public class ThreaA extends Thread{
   private WorkObject workObject;

public ThreaA(WorkObject workObject) {
	this.workObject = workObject;
}

@Override
public void run() {
  for(int i=0;i<10;i++) {
	  workObject.methodA();
  }
}
   

   
	
}
