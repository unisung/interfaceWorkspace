package ch08;

public class ThreaB extends Thread{
   private WorkObject workObject;

public ThreaB(WorkObject workObject) {
	this.workObject = workObject;
}

@Override
public void run() {
  for(int i=0;i<10;i++) {
	  workObject.methodB();
  }
}
   

   
	
}
