package ch03;
/* 1 ºÎÅÍ 20±îÁö Ãâ·Â , È¦¼ö,Â¦¼ö */
public class ThreadEx1 {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%2==0) System.out.println(i+"´Â Â¦¼ö");
		}
		
		for(int i=1;i<=20;i++) {
			if(i%2!=0) System.out.println(i+"´Â È¦¼ö");
		}
	}
}
