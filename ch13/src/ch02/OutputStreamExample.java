package ch02;

import java.io.FileOutputStream;

/* byte������ ���� ����ϴ�  ��Ʈ�� */
public class OutputStreamExample {

	public static void main(String[] args) {
		byte[] b= {7,51,3,4,-1,24};
		try {
			     FileOutputStream fout
			      = new FileOutputStream("c:\\temp\\test.out");
			     for(int i=0;i<b.length;i++) {
			    	  fout.write(b[i]);//byte������ ����
			     }
	             fout.close();
	             System.out.println("������ �����Ͽ����ϴ�.");
		}catch(Exception e) {
			System.out.println("���� �߻�:"+e.getMessage());
		}
	}

}
