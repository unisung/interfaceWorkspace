package ch02;

import java.io.File;
import java.io.FileInputStream;

/* byte������ ����Ÿ�� �о���̴� ��Ʈ�� */
public class InputStreamExample {

	public static void main(String[] args) {
		
		System.out.println("����� ����Ÿ byte����:"+new File("c:\\temp\\test.out").length());
		//byte���� ������ �迭
		byte[] b=new byte[6];
		
		
		try {
			     //���Ϸ� ���� byte������ ����Ÿ �Է���� FileInputStream����
			      FileInputStream fin=new FileInputStream("c:\\temp\\test.out");
			      int n=0;//index�� ����
			      int c;//byte���� �� �Է� ����Ÿ ���庯��
			      
			      while((c=fin.read())!=-1) {// read()�� ���� byte���� intŸ������ ��ȯ���, ���� ����Ÿ�� ������ -1����
			    	     b[n]=(byte)c;// int -> byte
			    	     n++;//�迭�� index��ȣ ����
			      }
			      
			      System.out.println("c:\\temp\\test.out �� ����� ���� ���: ");
			      //�迭 ���� ���
			      for(int i=0;i<b.length;i++)
			    	   System.out.print(b[i]+"\t");
			      //�ڿ�����
			      fin.close();
		}catch(Exception e) {
			 System.out.println("�����߻�: " +e.getMessage());
		}
	}

}
