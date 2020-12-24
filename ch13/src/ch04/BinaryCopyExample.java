package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//byte������ ����� ����Ÿ(�̹���,����,����)������ ����
public class BinaryCopyExample {

	public static void main(String[] args) {
		//���� ���� ��ü ����
		File src=new File("c:\\temp\\img1.jpg");//
		File dest=new File("c:\\temp\\copyimg.jpg");
		
		//byte������ ����Ÿ�� intŸ���� c�� �����ϱ����� ���� ����
		int c;
		try {
			     //byte���� ���̳ʸ� ���� ��Ʈ�� ��ü ����
			    FileInputStream fi = new FileInputStream(src);
			    FileOutputStream fo=new FileOutputStream(dest);
			    
			    while((c=fi.read())!=-1){//1byte �а�,
			    	      fo.write((byte)c);//1byte ����
			    }
			    //�ڿ�����
			    fi.close();
			    fo.close();
			    System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
			
		}catch(Exception e) {
			System.out.println("���� ���� ����");
		}
	

	}

}
