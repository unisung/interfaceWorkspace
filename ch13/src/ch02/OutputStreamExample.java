package ch02;

import java.io.FileOutputStream;

/* byte단위의 값을 출력하는  스트림 */
public class OutputStreamExample {

	public static void main(String[] args) {
		byte[] b= {7,51,3,4,-1,24};
		try {
			     FileOutputStream fout
			      = new FileOutputStream("c:\\temp\\test.out");
			     for(int i=0;i<b.length;i++) {
			    	  fout.write(b[i]);//byte단위로 저장
			     }
	             fout.close();
	             System.out.println("파일을 저장하였습니다.");
		}catch(Exception e) {
			System.out.println("오류 발생:"+e.getMessage());
		}
	}

}
