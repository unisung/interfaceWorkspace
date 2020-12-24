package ch03;

import java.io.BufferedOutputStream;
import java.io.FileReader;

//��ü���� ����Ÿ�� ������ buffer�� �ִ� ��Ʈ�� Buffered��Ʈ��
public class BufferedExample {

	public static void main(String[] args) {
		 FileReader fin=null;
		 int c;
		 try {
			 //�Է½�Ʈ��
			    fin=new FileReader("c:\\temp\\test2.txt");
			 //��½�Ʈ��
			    BufferedOutputStream out
			    =new BufferedOutputStream(System.out,5);//BufferedOutputStream(��¹���,����ũ��)
			    //���ڿ� ������ ���� ������ ����Ϳ� byte������ ���
			    while((c=fin.read())!=-1) {
			    	  out.write(c);//���
			    }
			    //���۳��� �о��
			    out.flush();//���ۿ� �����ִ� ���� ���
		 }catch(Exception e) {
			 System.out.println("�����߻�: "+e.getMessage());
		 }finally {
			 try {
			 fin.close();
			 }catch(Exception e) {}
		 }

	}

}
