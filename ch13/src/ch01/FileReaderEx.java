package ch01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin=null;
		
	  try {
		  //���ϰ� java���α׷����� ���ڴ��� ����Ÿ ���� ��� ����
		    fin=new FileReader("c:\\Temp\\test.txt");
		    int c;//�Էµ� ���ڰ��� �ޱ� ���� ���� ���� read()�Լ��� ���ϰ� intŸ�� 
		
		    //2byte�� ���Ϸ� ���� �о ����Ϳ� ���
		    while((c=fin.read())!=-1) {//4byte������
		    	  System.out.print((char)c);//2byte�� ��ȯ ���
		    }
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
		fin.close();//�ڿ�����
		}catch(Exception e) {}
	}

	}

}
